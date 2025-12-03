package com.dicon.bcu.common.chat.entity.edits;

import com.dicon.bcu.common.chat.entity.common.Choice;
import com.dicon.bcu.common.chat.entity.common.Usage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:25
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EditResponse implements Serializable {
    private String id;
    private String object;
    private long created;
    private String model;
    private Choice[] choices;
    private Usage usage;
}
