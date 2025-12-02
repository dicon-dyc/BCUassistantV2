package com.dicon.bcu.system.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:20
 */
@Data
@TableName("sys_user_post")
public class SysUserPost {

    /**
     * 用户ID
     */
    @TableId(type = IdType.INPUT)
    private Long userId;

    /**
     * 岗位ID
     */
    private Long postId;

}
