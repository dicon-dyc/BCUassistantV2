package com.dicon.bcu.common.core.exception.user;

import com.dicon.bcu.common.core.exception.base.BaseException;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:37
 */
public class UserException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object... args) {
        super("user", code, args, null);
    }
}
