package com.dicon.bcu.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.dicon.bcu.domain.KnowledgeRoleRelation;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:47
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = KnowledgeRoleRelation.class)
public class KnowledgeRoleRelationVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ExcelProperty(value = "id")
    private Long id;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String remark;

    /**
     * 知识库角色id
     */
    @ExcelProperty(value = "知识库角色id")
    private Long knowledgeRoleId;

    /**
     * 知识库id
     */
    @ExcelProperty(value = "知识库id")
    private Long knowledgeId;


}