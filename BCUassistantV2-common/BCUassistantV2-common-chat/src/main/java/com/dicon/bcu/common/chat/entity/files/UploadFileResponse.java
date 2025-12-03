package com.dicon.bcu.common.chat.entity.files;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:57
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UploadFileResponse extends File implements Serializable {
}