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

    /**
     * 物理表分类
     * */
    public enum CLASSTYPE {
        IMPORT("导入","1"),
        SYSCREATE("系统创建","2");

        private String desc;//中文描述
        private String value;//中文描述
        private CLASSTYPE(String desc,String value){
            this.desc=desc;
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }

    /**
     * 字段类型
     * */
    public enum FILETYPE {
        VARCHAR("字符串","1"),
        BIGINT("大数字","2"),
        INT("数字类型","3"),
        DATE("日期类型","4"),
        DATETIME("日期时间","5"),
        LONGTEXT("长文本类型","6");

        private String desc;//中文描述
        private String value;//中文描述
        private FILETYPE(String desc,String value){
            this.desc=desc;
            this.value=value;
        }

        public static String getDesc(String value) {
            FILETYPE[] businessModeEnums = values();
            for (FILETYPE businessModeEnum : businessModeEnums) {
                if (businessModeEnum.name().equals(value)) {
                    return businessModeEnum.value;
                }
            }
            return null;
        }

        public String getValue(){
            return value;
        }
    }

    /**
     * 字段类型
     * */
    public enum INPUTTYPE {
        INPUT("文本输入框","1"),
        PASSWORD("密码框","2"),
        RADIO("单选","3"),
        CHECKBOX("多选","4"),
        DATESELECT("日期选择器","5"),
        DATETTIMESELECT("日期时间选择器","6"),
        FILEUPLOAD("文件上传","7"),
        TEXTAREA("文本域","8");

        private String desc;//中文描述
        private String value;//中文描述

        private INPUTTYPE(String desc,String value){
            this.desc=desc;
            this.value=value;
        }

        public static String getDesc(String value) {
            INPUTTYPE[] inputTypes = values();
            for (INPUTTYPE item : inputTypes) {
                if (item.name().equals(value)) {
                    return item.value;
                }
            }
            return null;
        }

        public String getValue(){
            return value;
        }
    }
}
