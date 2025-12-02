package com.dicon.bcu.common.tenant.exception;

import com.dicon.bcu.common.core.exception.base.BaseException;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:57
 */
public class TenantException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public TenantException(String code, Object... args) {
        super("tenant", code, args, null);
    }
}