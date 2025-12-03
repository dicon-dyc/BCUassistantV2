package com.dicon.bcu.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dicon.bcu.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:42
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("knowledge_role")
public class KnowledgeRole extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 知识库角色id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 知识库角色组id
     */
    private Long groupId;

    /**
     * 知识库角色name
     */
    private String name;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    // @TableLogic
    private String delFlag;

    /**
     * 备注
     */
    private String remark;


    /**
     * 知识库id列表
     */
    @TableField(exist = false)
    private List<Long> knowledgeIds;

}