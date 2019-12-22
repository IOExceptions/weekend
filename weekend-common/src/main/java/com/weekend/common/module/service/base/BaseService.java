package com.weekend.common.module.service.base;

import com.baomidou.mybatisplus.service.IService;
import com.weekend.common.module.model.sys.SysMenu;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 20:35
 */
public interface BaseService<T> extends IService<T> {

    public String test();

}
