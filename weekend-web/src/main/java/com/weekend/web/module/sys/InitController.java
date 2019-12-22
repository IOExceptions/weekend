package com.weekend.web.module.sys;

import com.weekend.common.module.service.sys.InitService;
import com.weekend.common.module.vo.response.code.Tip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/init")
public class InitController {

    @Autowired
    private InitService initService;

    /**
     * 初始化物理表到系统模块
     * */
    @ResponseBody
    @RequestMapping("/initTable")
    public Tip initTable(@RequestParam Map<String,Object> param){
        return initService.initTable(param);
    }

}
