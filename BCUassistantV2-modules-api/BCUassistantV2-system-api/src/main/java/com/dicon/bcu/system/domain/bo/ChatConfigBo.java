package com.dicon.bcu.system.domain.bo;

import com.dicon.bcu.common.core.validate.AddGroup;
import com.dicon.bcu.common.core.validate.EditGroup;
import com.dicon.bcu.core.domain.BaseEntity;
import com.dicon.bcu.system.domain.ChatConfig;
import io.github.linpeilie.annotations.AutoMapper;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = ChatConfig.class, reverseConvertGenerate = false)
public class ChatConfigBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 配置类型
     */
    @NotBlank(message = "配置类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String category;

    /**
     * 配置名称
     */
    @NotBlank(message = "配置名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String configName;

    /**
     * 配置值
     */
    @NotBlank(message = "配置值不能为空", groups = { AddGroup.class, EditGroup.class })
    private String configValue;

    /**
     * 说明
     */
    @NotBlank(message = "说明不能为空", groups = { AddGroup.class, EditGroup.class })
    private String configDict;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String remark;

    /**
     * 更新IP
     */
    @NotBlank(message = "更新IP不能为空", groups = { AddGroup.class, EditGroup.class })
    private String updateIp;


}
