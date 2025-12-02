package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysTenantPackage;
import com.dicon.bcu.system.domain.vo.SysTenantPackageVo;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/1 15:10
 */
@Mapper
public interface SysTenantPackageMapper extends BaseMapperPlus<SysTenantPackage, SysTenantPackageVo> {

}
