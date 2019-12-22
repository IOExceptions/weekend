package com.weekend.common.module.vo.response.code;

public  class ErrorTip extends Tip{

    public ErrorTip(){
        this.setCode(0);
        this.setMessage("失败");
    }

}
