package com.dicon.bcu.common.chat.entity.moderations;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:14
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result implements Serializable {
    private Categories categories;
    @JsonProperty("category_scores")
    private CategoryScores categoryScores;
    private boolean flagged;
}