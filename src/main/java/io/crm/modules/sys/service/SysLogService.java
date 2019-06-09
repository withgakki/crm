package io.crm.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.crm.common.utils.PageUtils;
import io.crm.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
