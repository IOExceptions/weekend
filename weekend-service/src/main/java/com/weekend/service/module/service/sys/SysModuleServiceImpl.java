package com.weekend.service.module.service.sys;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weekend.common.module.mapper.sys.SysModuleMapper;
import com.weekend.common.module.model.sys.SysModule;
import com.weekend.common.module.service.sys.SysModuleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 模块表(sys_module) 服务实现类
 * </p>
 *
 * @author WangZhiKun
 * @since 2019-12-22
 */
@Service
public class SysModuleServiceImpl extends ServiceImpl<SysModuleMapper, SysModule> implements SysModuleService {

}
