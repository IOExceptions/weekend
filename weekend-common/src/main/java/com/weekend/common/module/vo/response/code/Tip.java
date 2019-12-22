package com.weekend.common.module.vo.response.code;

import lombok.Data;

import java.util.Map;

@Data
public class Tip {

    private Integer code;

    private Map<String,Object> data;

    private Object rows;

    private String message;

    public Tip error(Integer code,String message){
        this.code=code;
        this.message=message;
        return this;
    }
}
