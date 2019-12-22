package com.weekend.common.module.dto.sys;

import lombok.Data;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 16:45
 */
@Data
public class DatabaseInfo {

    /**
     * 字段名
     * */
    private String fieldName;
    /**
     * 字段注释
     * */
    private String annotation;
    /**
     * 字段类型
     * */
    private String type;
    /**
     * 长度
     * */
    private Integer length;
    /**
     * 是否允许为空
     * */
    private String emptyStatus;
    /**
     * 主键标识
     * */
    private String primaryKeyFlag;


}
