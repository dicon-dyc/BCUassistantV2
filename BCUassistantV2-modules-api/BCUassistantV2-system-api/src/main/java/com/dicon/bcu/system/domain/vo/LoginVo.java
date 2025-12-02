package com.dicon.bcu.system.domain.vo;

import com.dicon.bcu.common.core.domain.model.LoginUser;
import lombok.Data;

/**
 * @Author: dyc
 * @Create: 2025/12/2 16:08
 */
@Data
public class LoginVo {
    private String token;
    // 兼容新版后台管理系统
    private String access_token;
    private LoginUser userInfo;
}