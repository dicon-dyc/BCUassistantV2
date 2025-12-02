package com.dicon.bcu.common.core.exception.user;

import java.io.Serial;

/**
 * @Author: dyc
 * @Create: 2025/12/2 14:35
 */
public class CaptchaException extends UserException {

    @Serial
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.jcaptcha.error");
    }
}
