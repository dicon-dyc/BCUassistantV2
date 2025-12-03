package com.dicon.bcu.chat.enums;

import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:26
 */
@Getter
public enum BillingType {
    TOKEN("1", "token扣费"),
    TIMES("2", "次数扣费");

    private final String code;
    private final String description;

    BillingType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static BillingType fromCode(String code) {
        for (BillingType type : values()) {
            if (type.getCode().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}