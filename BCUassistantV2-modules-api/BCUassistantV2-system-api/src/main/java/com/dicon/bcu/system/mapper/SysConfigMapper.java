package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysConfig;
import com.dicon.bcu.system.domain.vo.SysConfigVo;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: dyc
 * @Create: 2025/12/1 15:38
 */
@Mapper
public interface SysConfigMapper extends BaseMapperPlus<SysConfig, SysConfigVo> {

}