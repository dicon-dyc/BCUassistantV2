package com.dicon.bcu.chat.enums;

import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:26
 */
@Getter
public enum UserGradeType {
    UNPAID("0", "未付费"),
    PAID("1", "已付费");

    private final String code;
    private final String description;

    UserGradeType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static UserGradeType fromCode(String code) {
        for (UserGradeType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

}