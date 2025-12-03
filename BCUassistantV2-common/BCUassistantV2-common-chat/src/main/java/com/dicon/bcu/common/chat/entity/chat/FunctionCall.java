package com.dicon.bcu.common.chat.entity.chat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 函数调用返回值
 *
 * @Author: dyc
 * @Create: 2025/12/2 19:45
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FunctionCall {
    /**
     * 方法名
     */
    private String name;
    /**
     * 方法参数
     */
    private String arguments;
}
