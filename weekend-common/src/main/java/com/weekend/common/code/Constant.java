package com.weekend.common.code;

public class Constant {
    public enum YESNO {
        YES("是","1"),
        NO("否","0");
        private String desc;//中文描述

        private String value;//中文描述

        private YESNO(String desc,String value){
            this.desc=desc;
            this.value=value;
        }

        public String getValue(){
            return value;
        }
    }
    public enum STATUS {
        START("启用","1"),
        disabled("禁用","0");

        private String desc;//中文描述
        private String value;//中文描述

        private STATUS(String desc,String value){
            this.desc=desc;
            this.value=value;
        }

        public String getValue(){
            return value;
        }
    }
}
