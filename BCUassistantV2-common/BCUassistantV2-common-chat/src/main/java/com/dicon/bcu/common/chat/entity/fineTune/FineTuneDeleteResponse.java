package com.dicon.bcu.common.chat.entity.fineTune;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:24
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FineTuneDeleteResponse implements Serializable {

    private String id;

    private String object;

    private boolean deleted;

}