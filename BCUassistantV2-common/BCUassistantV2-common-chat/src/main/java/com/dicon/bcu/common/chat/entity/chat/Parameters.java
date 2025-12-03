package com.dicon.bcu.common.chat.entity.chat;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:35
 */
@Data
@Builder
public class Parameters implements Serializable {
    /**
     * 参数类型
     */
    private String type;
    /**
     * 参数属性、描述
     */
    private Object properties;
    /**
     * 方法必输字段
     */
    private List<String> required;
}