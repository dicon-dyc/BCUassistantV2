package com.dicon.bcu.common.chat.entity.fineTune;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:23
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingFile implements Serializable {

    private String id;
    private String object;
    private long bytes;
    @JsonProperty("created_at")
    private long createdAt;
    private String filename;
    private String purpose;
    private String status;
    @JsonProperty("status_details")
    private String statusDetails;
}
