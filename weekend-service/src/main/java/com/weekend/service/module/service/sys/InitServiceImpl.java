package com.weekend.service.module.service.sys;

import com.weekend.common.module.service.sys.InitService;
import com.weekend.common.module.vo.response.code.SuccessTip;
import com.weekend.common.module.vo.response.code.Tip;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author :WangZhiKun
 * @description: TODO
 * @date ：2019/12/22 15:06
 */
@Service
public class InitServiceImpl implements InitService {

    @Override
    public Tip initTable(Map<String, Object> initTable) {
        Tip tip=new SuccessTip();

        return tip;
    }
}
