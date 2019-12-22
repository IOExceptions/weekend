package com.weekend.common.ulits;


import com.weekend.common.module.dto.sys.DatabaseInfo;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.*;
import java.util.*;

import static com.baomidou.mybatisplus.mapper.SqlRunner.SQL;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 16:28
 */
public class ConnectionUlits {

    private static String url;

    private static String user;

    private static String password;

    private static String PROPERTY_NAME = "application.yml";

    private static String SQL="select * from ";


    /**
     * 获取连接
     * */
    public static Connection getConnection() {
        Connection conn = null;
        String url=String.valueOf(ConnectionUlits.getCommonYml("spring.datasource.url"));
        String username=String.valueOf(ConnectionUlits.getCommonYml("spring.datasource.username"));
        String password=String.valueOf(ConnectionUlits.getCommonYml("spring.datasource.password"));
        try {
            conn = DriverManager.getConnection(url,username, password);
        } catch (SQLException e) {
//            log.error("获取数据库连接失败", e);
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 读取配置文件信息
     * */
    public static Object getCommonYml(Object key){
        Resource resource = new ClassPathResource(PROPERTY_NAME);
        Properties properties = null;
        try {
            YamlPropertiesFactoryBean yamlFactory = new YamlPropertiesFactoryBean();
            yamlFactory.setResources(resource);
            properties =  yamlFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return properties.get(key);
    }

    /**
     * 获取数据库下所有表名
     * */
    public static List<String> getTableNames() {
        List<String> tableNames = new ArrayList<>();
        Connection conn = getConnection();
        ResultSet rs = null;
        try {
            //获取数据库的元数据
            DatabaseMetaData db = conn.getMetaData();
            //从元数据中获取到所有的表名
            rs = db.getTables("lwj_odin_v2", null, null, new String[]{"TABLE"});
            while (rs.next()) {
                tableNames.add(rs.getString(3));
            }
        } catch (SQLException e) {
//            LOGGER.error("获取数据库表信息失败", e);
        } finally {
            try {
                rs.close();
                closeConnection(conn);
            } catch (SQLException e) {
//                LOGGER.error("关闭数据库连接失败", e);
            }
        }
        return tableNames;
    }

    /**
     * 获取表信息
     * */
    public static Map<String,Object> getTableInfo(String tableName) throws SQLException {
        Map<String,Object> tableInfo=new HashMap<>();
        String[] tableNames=new String[]{tableName};
        Connection conn = getConnection();
        DatabaseMetaData dbMetaData = conn.getMetaData();
        ResultSet rs = dbMetaData.getTables(null, null, tableName, null);
        int i = 0;
        while (rs.next()) {
            i++;
            if(i==10) {
                break;
            }
            System.out.println("表名：" + rs.getString("TABLE_NAME"));
            System.out.println("表类型：" + rs.getString("TABLE_TYPE"));
            System.out.println("表所属数据库：" + rs.getString("TABLE_CAT"));
            System.out.println("表备注：" + rs.getString("REMARKS"));
            tableInfo.put("code",rs.getString("TABLE_NAME"));
            tableInfo.put("name",rs.getString("TABLE_TYPE"));
            tableInfo.put("dataBase",rs.getString("TABLE_CAT"));
            tableInfo.put("remark",rs.getString("REMARKS"));

        }
        return tableInfo;
    }

    /**
     * 获取表中字段和注释的关系并存入map对象
     * */
    public static Map<String,String> getColumnComments(String tableName) {
        //用于存储字段与注释
        Map<String,String>columnMap=new HashMap<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(tableSql);
            rs = ps.executeQuery("show full columns from " + tableName);
            while (rs.next()) {
                columnMap.put(rs.getString("Field"),rs.getString("Comment"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    closeConnection(conn);
                } catch (SQLException e) {
//                    LOGGER.error("数据库操作失败", e);
                }
            }
        }
        return columnMap;
    }

    /**
     * 获取表中字段和注释的关系并存入map对象
     * */
    public static List<Map<String,Object>> getColumnComments2(String tableName) {
        //用于存储字段与注释
        List<Map<String,Object>> columnMap=new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(tableSql);
            rs = ps.executeQuery("show full columns from " + tableName);
            while (rs.next()) {
                Map<String,Object> field=new HashMap<>();
                field.put("code",rs.getString("Field"));
                field.put("comment",rs.getString("Comment"));
                columnMap.add(field);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                    closeConnection(conn);
                } catch (SQLException e) {
//                    LOGGER.error("数据库操作失败", e);
                }
            }
        }
        return columnMap;
    }

    /**
     * 获取表中所有字段信息
     * */
    public static List<DatabaseInfo> getColumnNames(String tableName ) {
        //获取字段和注释的关联关系
        Map<String,String> columnMap=ConnectionUlits.getColumnComments(tableName);
        List<DatabaseInfo> databaseInfos = new ArrayList<>();
        //与数据库的连接
        Connection conn = getConnection();
        PreparedStatement pStemt = null;
        String tableSql = SQL + tableName;
        try {
            PreparedStatement ps= conn.prepareStatement(tableSql);
            //结果集元数据
            ResultSetMetaData rsmd = ps.getMetaData();
            //表列数
            int size = rsmd.getColumnCount();
            for (int i = 1; i <= size; i++) {
                DatabaseInfo databaseInfo=new DatabaseInfo();
                //获取字段名称
                databaseInfo.setFieldName(rsmd.getColumnName(i));
                //获取字段类型
                databaseInfo.setType(rsmd.getColumnTypeName(i));
                //字段是否为空
                databaseInfo.setEmptyStatus(String.valueOf(rsmd.isNullable(i)));
                //字段注释
                databaseInfo.setAnnotation(columnMap.get(rsmd.getColumnName(i)));

                databaseInfo.setLength(rsmd.getColumnDisplaySize(i));

                databaseInfos.add(databaseInfo);
            }
        } catch (SQLException e) {
//            LOGGER.error("获取数据库表的列信息失败", e);
        } finally {
            if (pStemt != null) {
                try {
                    pStemt.close();
                    closeConnection(conn);
                } catch (SQLException e) {
//                    LOGGER.error("关闭数据库连接失败", e);
                }
            }
        }
        return databaseInfos;
    }

    /**
     * 关闭连接
     * */
    public static void closeConnection(Connection conn){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
