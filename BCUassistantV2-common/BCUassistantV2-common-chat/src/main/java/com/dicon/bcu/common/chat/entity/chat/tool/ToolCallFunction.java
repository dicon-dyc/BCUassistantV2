package com.dicon.bcu.common.chat.entity.chat.tool;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:43
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToolCallFunction implements Serializable {
    /**
     * 方法名
     */
    private String name;
    /**
     * 方法参数
     */
    private String arguments;
}

