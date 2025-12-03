package com.dicon.bcu.chat.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:59
 */
@Getter
@AllArgsConstructor
public enum promptTemplateEnum {
    CHAT(1, "chat"),
    VECTOR(2, "vector"),
    ;

    private final Integer code;
    private final String desc;

}