package com.dicon.bcu.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dicon.bcu.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:46
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("knowledge_role_relation")
public class KnowledgeRoleRelation extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @TableLogic
    private String delFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 知识库角色id
     */
    private Long knowledgeRoleId;

    /**
     * 知识库id
     */
    private Long knowledgeId;


}