package com.dicon.bcu.common.chat.entity.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:24
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelResponse implements Serializable {
    private String object;
    private List<Model> data;
}