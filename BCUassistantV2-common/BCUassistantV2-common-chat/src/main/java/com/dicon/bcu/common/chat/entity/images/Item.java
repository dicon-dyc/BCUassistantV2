package com.dicon.bcu.common.chat.entity.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:56
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Serializable {
    private String url;
    @JsonProperty("b64_json")
    private String b64Json;
}