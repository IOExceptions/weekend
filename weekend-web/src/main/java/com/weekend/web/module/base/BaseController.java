package com.weekend.web.module.base;

import com.weekend.common.module.service.base.BaseService;
import com.weekend.service.module.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 20:52
 */
@Controller
public class BaseController <T extends BaseService> {

    @RequestMapping("/list")
    @ResponseBody
    public String list(){

        return "";
    }

}
