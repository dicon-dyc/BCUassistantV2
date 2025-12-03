package com.dicon.bcu.common.chat.entity.embeddings;

import com.dicon.bcu.common.chat.entity.common.Usage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:05
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmbeddingResponse implements Serializable {

    private String object;
    private List<Item> data;
    private String model;
    private Usage usage;
}

