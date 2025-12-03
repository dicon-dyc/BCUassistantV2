package com.dicon.bcu.common.chat.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:22
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usage implements Serializable {
    @JsonProperty("prompt_tokens")
    private long promptTokens;
    @JsonProperty("completion_tokens")
    private long completionTokens;
    @JsonProperty("total_tokens")
    private long totalTokens;
}