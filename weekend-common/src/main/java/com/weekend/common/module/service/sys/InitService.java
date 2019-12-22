package com.weekend.common.module.service.sys;

import com.weekend.common.module.vo.response.code.Tip;

import java.util.Map;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 15:06
 */
public interface InitService {

    public Tip initTable(Map<String,Object> param);

}
