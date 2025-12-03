package com.dicon.bcu.common.chat.entity.chat.tool;

import lombok.*;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:42
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToolCalls implements Serializable {
    /**
     * The ID of the tool call.
     */
    private String id;
    /**
     * The type of the tool. Currently, only function is supported.
     */
    private String type;

    private ToolCallFunction function;

    @Getter
    @AllArgsConstructor
    public enum Type {
        FUNCTION("function"),
        ;
        private final String name;
    }
}
