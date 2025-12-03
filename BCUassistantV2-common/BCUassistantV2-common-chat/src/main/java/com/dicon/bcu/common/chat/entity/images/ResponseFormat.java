package com.dicon.bcu.common.chat.entity.images;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:53
 */
@AllArgsConstructor
@Getter
public enum ResponseFormat implements Serializable {
    URL("url"),
    B64_JSON("b64_json"),
    ;

    private String name;
}
