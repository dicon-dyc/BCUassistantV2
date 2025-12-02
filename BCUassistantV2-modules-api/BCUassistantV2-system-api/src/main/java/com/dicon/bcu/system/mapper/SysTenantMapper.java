package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysTenant;
import com.dicon.bcu.system.domain.vo.SysTenantVo;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/1 15:29
 */
@Mapper
public interface SysTenantMapper extends BaseMapperPlus<SysTenant, SysTenantVo> {

}
