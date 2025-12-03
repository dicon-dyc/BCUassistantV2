package com.dicon.bcu.common.chat.entity.images;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 20:56
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageResponse implements Serializable {
    private long created;
    private List<Item> data;
}