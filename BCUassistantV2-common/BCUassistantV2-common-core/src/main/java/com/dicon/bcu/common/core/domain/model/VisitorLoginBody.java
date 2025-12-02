package com.dicon.bcu.common.core.domain.model;

import lombok.Data;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/2 16:10
 */
@Data
public class VisitorLoginBody {

    @Serial
    private static final long serialVersionUID = 1L;

    private String code;

    /**
     * 登录类型(1.小程序访客 2.pc访客)
     */
    private String type;

}