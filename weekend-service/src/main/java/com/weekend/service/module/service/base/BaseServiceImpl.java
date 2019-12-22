package com.weekend.service.module.service.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weekend.common.module.service.base.BaseService;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 20:37
 */
public class BaseServiceImpl<T> extends ServiceImpl<BaseMapper<T>, T> implements BaseService<T> {

    public String test(){
        return "哈哈";
    }

}
