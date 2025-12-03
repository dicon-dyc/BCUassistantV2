package com.dicon.bcu.common.chat.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:07
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteResponse implements Serializable {
    private String id;
    private String object;
    private boolean deleted;
}
