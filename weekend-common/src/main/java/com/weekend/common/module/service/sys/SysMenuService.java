package com.weekend.common.module.service.sys;


import com.baomidou.mybatisplus.service.IService;
import com.weekend.common.module.model.sys.SysMenu;
import com.weekend.common.module.vo.response.code.Tip;

/**
 * <p>
 * sys_menu 服务类
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-19
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 获取所有有效的菜单
     * */
    public Tip getMenuAll();

    /**
     * 获取所有有效的菜单
     * */
    public Tip getMenuAllTree();


}
