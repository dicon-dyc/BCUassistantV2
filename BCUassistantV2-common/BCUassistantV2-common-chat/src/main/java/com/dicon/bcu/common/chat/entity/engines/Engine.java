package com.dicon.bcu.common.chat.entity.engines;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:28
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Engine implements Serializable {

    private String id;
    private String object;
    private String owner;
    private boolean ready;
    private Object permissions;
    private long created;

}