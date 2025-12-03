package com.dicon.bcu.domain.bo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:33
 */
@Data
public class KnowledgeInfoUploadBo {

    private String kid;

    private MultipartFile file;

}
