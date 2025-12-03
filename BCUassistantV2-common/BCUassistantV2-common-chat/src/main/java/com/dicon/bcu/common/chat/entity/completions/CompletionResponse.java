package com.dicon.bcu.common.chat.entity.completions;

import com.dicon.bcu.common.chat.entity.common.Choice;
import com.dicon.bcu.common.chat.entity.common.OpenAiResponse;
import com.dicon.bcu.common.chat.entity.common.Usage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:20
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompletionResponse extends OpenAiResponse implements Serializable {
    private String id;
    private String object;
    private long created;
    private String model;
    private Choice[] choices;
    private Usage usage;
}
