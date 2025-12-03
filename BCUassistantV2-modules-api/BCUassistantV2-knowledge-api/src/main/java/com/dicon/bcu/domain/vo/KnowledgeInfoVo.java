package com.dicon.bcu.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.dicon.bcu.common.excel.annotation.ExcelDictFormat;
import com.dicon.bcu.common.excel.convert.ExcelDictConvert;
import com.dicon.bcu.domain.KnowledgeInfo;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:32
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = KnowledgeInfo.class)
public class KnowledgeInfoVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @ExcelProperty(value = "")
    private Long id;

    /**
     * 知识库ID
     */
    @ExcelProperty(value = "知识库ID")
    private String kid;

    /**
     * 用户ID
     */
    @ExcelProperty(value = "用户ID")
    private Long uid;

    /**
     * 知识库名称
     */
    @ExcelProperty(value = "知识库名称")
    private String kname;

    /**
     * 是否公开知识库（0 否 1是）
     */
    @ExcelProperty(value = "是否公开知识库", converter = ExcelDictConvert.class)
    @ExcelDictFormat(readConverterExp = "0=,否=,1=是")
    private Integer share;

    /**
     * 描述
     */
    @ExcelProperty(value = "描述")
    private String description;

    /**
     * 知识分隔符
     */
    @ExcelProperty(value = "知识分隔符")
    private String knowledgeSeparator;

    /**
     * 提问分隔符
     */
    @ExcelProperty(value = "提问分隔符")
    private String questionSeparator;

    /**
     * 重叠字符数
     */
    @ExcelProperty(value = "重叠字符数")
    private Integer overlapChar;

    /**
     * 知识库中检索的条数
     */
    @ExcelProperty(value = "知识库中检索的条数")
    private Integer retrieveLimit;

    /**
     * 文本块大小
     */
    @ExcelProperty(value = "文本块大小")
    private Integer textBlockSize;

    /**
     * 向量库模型名称
     */
    private String vectorModelName;

    /**
     * 向量化模型名称
     */
    private String embeddingModelName;


    /**
     * 系统提示词
     */
    private String systemPrompt;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String remark;


}
