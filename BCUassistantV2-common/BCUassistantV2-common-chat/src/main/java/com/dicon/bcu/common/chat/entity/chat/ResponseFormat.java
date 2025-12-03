package com.dicon.bcu.common.chat.entity.chat;

import lombok.*;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:34
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseFormat {
    /**
     * 默认：text
     *
     * @see Type
     */
    private String type;

    @Getter
    @AllArgsConstructor
    public enum Type {
        JSON_OBJECT("json_object"),
        TEXT("text"),
        ;
        private final String name;

    }
}