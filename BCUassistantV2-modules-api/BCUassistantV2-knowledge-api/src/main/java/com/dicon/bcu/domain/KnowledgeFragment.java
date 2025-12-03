package com.dicon.bcu.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.dicon.bcu.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("knowledge_fragment")
public class KnowledgeFragment extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 知识库ID
     */
    private String kid;

    /**
     * 文档ID
     */
    private String docId;

    /**
     * 知识片段ID
     */
    private String fid;

    /**
     * 片段索引下标
     */
    private Integer idx;

    /**
     * 文档内容
     */
    private String content;

    /**
     * 备注
     */
    private String remark;


}
