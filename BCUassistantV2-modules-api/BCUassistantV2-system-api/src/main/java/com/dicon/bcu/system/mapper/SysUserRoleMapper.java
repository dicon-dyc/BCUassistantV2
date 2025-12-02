package com.dicon.bcu.system.mapper;

import com.dicon.bcu.system.domain.SysUserRole;
import com.dicon.bcu.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户与角色关联表
 *
 * @Author: dyc
 * @Create: 2025/12/1 14:24
 */
@Mapper
public interface SysUserRoleMapper extends BaseMapperPlus<SysUserRole,SysUserRole> {

    List<Long> selectUserIdsByRoleId(Long roleId);

}
