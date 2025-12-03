package com.dicon.bcu.common.chat.entity.whisper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:48
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WhisperResponse implements Serializable {

    private String text;
}
