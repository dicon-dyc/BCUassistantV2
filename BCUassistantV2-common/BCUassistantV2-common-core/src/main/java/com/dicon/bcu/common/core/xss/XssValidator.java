package com.dicon.bcu.common.core.xss;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HtmlUtil;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @Author: dyc
 * @Create: 2025/12/1 13:31
 */
public class XssValidator implements ConstraintValidator<Xss, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !ReUtil.contains(HtmlUtil.RE_HTML_MARK, value);
    }
}
