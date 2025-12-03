package com.dicon.bcu.common.chat.entity.chat;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:34
 */
@Data
@Builder
public class Functions implements Serializable {
    /**
     * 方法名称
     */
    private String name;
    /**
     * 方法描述
     */
    private String description;
    /**
     * 方法参数
     * 扩展参数可以继承Parameters自己实现，json格式的数据
     */
    private Parameters parameters;
}
