package com.dicon.bcu.common.core.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:30
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RegisterBody extends LoginBody {

    private String userType;

    /**
     * 注册域名
     */
    private String domainName;

}