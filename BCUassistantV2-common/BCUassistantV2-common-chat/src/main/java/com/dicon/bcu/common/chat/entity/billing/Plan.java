package com.dicon.bcu.common.chat.entity.billing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @Author: dyc
 * @Create: 2025/12/2 21:45
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan {
    private String title;
    private String id;
}