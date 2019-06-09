package io.crm.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.crm.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
