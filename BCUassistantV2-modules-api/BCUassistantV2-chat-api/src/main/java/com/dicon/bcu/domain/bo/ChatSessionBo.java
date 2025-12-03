package com.dicon.bcu.domain.bo;

import com.dicon.bcu.common.core.validate.EditGroup;
import com.dicon.bcu.core.domain.BaseEntity;
import com.dicon.bcu.domain.ChatSession;
import io.github.linpeilie.annotations.AutoMapper;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = ChatSession.class, reverseConvertGenerate = false)
public class ChatSessionBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 会话标题
     */
    private String sessionTitle;

    /**
     * 会话内容
     */
    private String sessionContent;

    /**
     * 备注
     */
    private String remark;
    /**
     * 会话id
     */
    private String conversationId;

}
