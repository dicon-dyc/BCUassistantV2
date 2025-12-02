package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysUserPost;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户与岗位关联表
 *
 * @Author: dyc
 * @Create: 2025/12/2 14:20
 */
@Mapper
public interface SysUserPostMapper extends BaseMapperPlus<SysUserPost, SysUserPost> {

}
