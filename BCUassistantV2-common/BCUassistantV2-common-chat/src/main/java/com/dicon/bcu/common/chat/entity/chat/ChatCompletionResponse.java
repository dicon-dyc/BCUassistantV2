package com.dicon.bcu.common.chat.entity.chat;

import com.dicon.bcu.common.chat.entity.common.Usage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * chat答案类
 *
 * @Author: dyc
 * @Create: 2025/12/2 21:29
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatCompletionResponse implements Serializable {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<ChatChoice> choices;
    private Usage usage;
}
