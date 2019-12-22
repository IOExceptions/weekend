package com.weekend.service.module.service.sys;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weekend.common.code.Constant;
import com.weekend.common.module.mapper.sys.SysMenuMapper;
import com.weekend.common.module.model.sys.SysMenu;
import com.weekend.common.module.service.sys.SysMenuService;
import com.weekend.common.module.vo.response.code.SuccessTip;
import com.weekend.common.module.vo.response.code.Tip;
import com.weekend.service.module.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * sys_menu 服务实现类
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-19
 */
@Service
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenu> implements SysMenuService {

    @Autowired
    private SysMenuMapper menuDao;

    @Override
    public Tip getMenuAll() {
        Tip reslt=new SuccessTip();
        EntityWrapper<SysMenu> menuEn=new EntityWrapper<>();
        menuEn.eq("status", Constant.STATUS.START.getValue());
        List<SysMenu> menus=selectList(menuEn);
        reslt.setRows(menus);
        return reslt;
    }

    @Override
    public Tip getMenuAllTree() {
        Tip reslt=new SuccessTip();
        EntityWrapper<SysMenu> menuEn=new EntityWrapper<>();
        menuEn.eq("parent_id",0);
        SysMenu parentNode=selectOne(menuEn);
        childNodes(parentNode.getId(),parentNode);
        reslt.setRows(parentNode);
        return reslt;
    }


    public void childNodes(Long parentId,SysMenu parentNode){
        EntityWrapper<SysMenu> menuEn=new EntityWrapper<>();
        menuEn.eq("parent_id",parentNode.getId());
        menuEn.orderBy("show_order");
        List<SysMenu> childs=selectList(menuEn);
        parentNode.setChildNodes(childs);
        childs.forEach(item->{
            childNodes(item.getId(),item);
        });
    }

}
