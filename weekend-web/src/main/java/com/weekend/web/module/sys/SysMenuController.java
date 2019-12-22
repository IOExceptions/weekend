package com.weekend.web.module.sys;


import com.weekend.common.module.model.sys.SysMenu;
import com.weekend.common.module.service.sys.SysMenuService;
import com.weekend.common.module.vo.response.code.Tip;
import com.weekend.service.module.service.sys.SysMenuServiceImpl;
import com.weekend.web.module.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * sys_menu 前端控制器
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-19
 */
@Controller
@RequestMapping("/sysMenu")
public class SysMenuController extends BaseController<SysMenuService>{

    @Autowired
    private SysMenuService menuService;

    @ResponseBody
    @RequestMapping("/getMenuAll")
    public Tip getMenuAll(){
        return menuService.getMenuAll();
    }

    @ResponseBody
    @RequestMapping("/getMenuAllTree")
    public Tip getMenuAllTree(){
        return menuService.getMenuAllTree();
    }



}

