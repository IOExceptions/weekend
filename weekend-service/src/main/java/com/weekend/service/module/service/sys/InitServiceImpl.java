package com.weekend.service.module.service.sys;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.toolkit.CollectionUtils;
import com.weekend.common.code.Constant;
import com.weekend.common.code.IdWorker;
import com.weekend.common.module.dto.sys.DatabaseInfo;
import com.weekend.common.module.model.sys.SysModule;
import com.weekend.common.module.model.sys.SysTable;
import com.weekend.common.module.model.sys.SysTableField;
import com.weekend.common.module.service.sys.InitService;
import com.weekend.common.module.service.sys.SysModuleService;
import com.weekend.common.module.service.sys.SysTableFieldService;
import com.weekend.common.module.service.sys.SysTableService;
import com.weekend.common.module.vo.response.code.SuccessTip;
import com.weekend.common.module.vo.response.code.Tip;
import com.weekend.common.ulits.ConnectionUlits;
import com.weekend.common.ulits.ToolUlits;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 15:06
 */
@Service
@Slf4j
public class InitServiceImpl implements InitService {

    @Autowired
    private SysTableService tableService;

    @Autowired
    private SysTableFieldService tableFieldService;

    @Autowired
    private SysModuleService moduleService;

    @Override
    @Transactional(rollbackFor=Exception.class)
    public Tip initTable(Map<String, Object> param) {
        Tip tip=new SuccessTip();
        if(!param.containsKey("tableName")|| !ToolUlits.isNotEmpty(MapUtils.getString(param,"tableName"))){
            return tip.error(1,"缺少参数");
        }
        String tableName=MapUtils.getString(param,"tableName");
        List<String> tableNames=Arrays.asList(tableName.split(","));
        Connection conn=ConnectionUlits.getConnection();
        tableNames.forEach(item->{
            EntityWrapper<SysTable> tableEw=new EntityWrapper<>();
            tableEw.eq("code",item);
            if(CollectionUtils.isNotEmpty(tableService.selectList(tableEw))){

            }else {
                //初始化表
                Map<String, Object> tableInfo = null;
                try {
                    tableInfo = ConnectionUlits.getTableInfo(item);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                SysTable sysTable = new SysTable();
                Long tableId=IdWorker.getId();
                sysTable.setId(tableId);
                sysTable.setCode(MapUtils.getString(tableInfo, "code"));
                sysTable.setDataBaseName(MapUtils.getString(tableInfo, "dataBase"));
                sysTable.setTableName(MapUtils.getString(tableInfo, "remark"));
                sysTable.setTableClass(Constant.CLASSTYPE.SYSCREATE.getValue());
                tableService.insert(sysTable);

                //初始化字段
                List<Map<String, Object>> columnMap = ConnectionUlits.getColumnComments2(item);
                List<DatabaseInfo> columnInfos = ConnectionUlits.getColumnNames(item);
                List<SysTableField> insertFields=new ArrayList<SysTableField>();
                columnInfos.forEach(fileItem->{
                    SysTableField sysField=new SysTableField();
                    sysField.setId(IdWorker.getId());
                    sysField.setTableId(tableId);
                    sysField.setCode(fileItem.getFieldName());
                    sysField.setName(fileItem.getAnnotation());
                    sysField.setCommentText(fileItem.getAnnotation());
                    sysField.setEditShow(Constant.YESNO.YES.getValue());
                    sysField.setViewShow(Constant.YESNO.YES.getValue());
                    sysField.setIsVerify(Constant.YESNO.NO.getValue());
                    sysField.setLength(fileItem.getLength());
                    sysField.setType(Constant.FILETYPE.getDesc(fileItem.getType()));
                    sysField.setListShow(Constant.YESNO.YES.getValue());
                    sysField.setFormShow(Constant.YESNO.YES.getValue());
                    sysField.setIsSynchronization(Constant.YESNO.YES.getValue());
                    log.info("fileItem:{}",fileItem);
                    switch(Constant.FILETYPE.getDesc(fileItem.getType())){
                        case "1"://字符串
                        case "2"://大数字
                        case "3"://数字类型
                        case "6"://长文本类型
                            sysField.setInputType(Constant.INPUTTYPE.INPUT.getValue());
                            break;
                        case "4"://日期类型
                            sysField.setInputType(Constant.INPUTTYPE.DATESELECT.getValue());
                            break;
                        case "5"://日期时间
                            sysField.setInputType(Constant.INPUTTYPE.DATETTIMESELECT.getValue());
                            break;
                        default://默认输入框
                            sysField.setInputType(Constant.INPUTTYPE.INPUT.getValue());
                    }

                    insertFields.add(sysField);
                });
                tableFieldService.insertBatch(insertFields);

                //初始化模块
                SysModule sysModule=new SysModule();
                sysModule.setId(IdWorker.getId());
                sysModule.setName(MapUtils.getString(tableInfo, "remark"));
                sysModule.setCode(item);
                sysModule.setTableId(tableId);
                sysModule.setIsTree(Constant.YESNO.NO.getValue());
                sysModule.setParentId(0L);
                sysModule.setStart(Constant.STATUS.START.getValue());
                sysModule.setIsSystem(Constant.YESNO.NO.getValue());
                moduleService.insert(sysModule);
            }
        });
        return tip;
    }
}
