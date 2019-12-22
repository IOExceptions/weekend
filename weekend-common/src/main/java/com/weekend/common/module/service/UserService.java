package com.weekend.common.module.service;

import com.baomidou.mybatisplus.service.IService;
import com.weekend.common.module.model.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-10
 */
public interface UserService extends IService<User> {

    public List<User> getAllUser();

}
