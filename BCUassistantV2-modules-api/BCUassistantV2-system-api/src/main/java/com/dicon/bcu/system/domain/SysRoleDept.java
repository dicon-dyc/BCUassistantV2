package com.dicon.bcu.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: dyc
 * @Create: 2025/12/1 14:26
 */

@Data
@TableName("sys_role_dept")
public class SysRoleDept {

    /**
     * 角色ID
     */
    @TableId(type = IdType.INPUT)
    private Long roleId;

    /**
     * 部门ID
     */
    private Long deptId;
}
