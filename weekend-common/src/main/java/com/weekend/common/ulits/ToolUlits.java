package com.weekend.common.ulits;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 15:59
 */
public class ToolUlits {

    public static Boolean isNotEmpty(Object obj){
        if(obj instanceof List){

        }else if(obj instanceof String){
            if(!(obj == null) && !"".equals(obj)){
                return true;
            }
        }else if(obj instanceof Map){

        }else if(obj instanceof MultipartFile){

        }
        return false;
    }

}
