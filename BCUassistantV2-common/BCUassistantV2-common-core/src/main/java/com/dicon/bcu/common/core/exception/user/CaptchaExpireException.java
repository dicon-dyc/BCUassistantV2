package com.dicon.bcu.common.core.exception.user;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:38
 */
public class CaptchaExpireException extends UserException {

    @Serial
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException() {
        super("user.jcaptcha.expire");
    }
}
