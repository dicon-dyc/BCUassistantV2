package com.dicon.bcu.common.chat.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:21
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Choice implements Serializable {
    private String text;
    private long index;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;
}
