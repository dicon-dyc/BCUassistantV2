package com.dicon.bcu.controller;
import cn.dev33.satoken.annotation.SaIgnore;
import com.dicon.bcu.common.core.domain.R;
import com.dicon.bcu.common.core.domain.model.LoginBody;
import com.dicon.bcu.common.core.domain.model.RegisterBody;
import com.dicon.bcu.common.core.domain.model.VisitorLoginBody;
import com.dicon.bcu.system.domain.vo.LoginVo;
import com.dicon.bcu.system.service.ISysTenantService;
import com.dicon.bcu.common.core.constant.Constants;
import com.dicon.bcu.common.satoken.utils.LoginHelper;
import com.dicon.bcu.system.service.SysLoginService;
import com.dicon.bcu.system.service.SysRegisterService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * 认证
 *
 * @Author: dyc
 * @Create: 2025/11/25 13:09
 */
@SaIgnore
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {


    private final SysLoginService loginService;
    private final SysRegisterService registerService;
    private final ISysTenantService tenantService;

    /**
     * 登录方法
     *
     * @param body 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public R<LoginVo> login(@Validated @RequestBody LoginBody body) {
        body.setTenantId(Constants.TENANT_ID);
        LoginVo loginVo = new LoginVo();
        // 生成令牌
        String token = loginService.login(
                body.getTenantId(),
                body.getUsername(), body.getPassword(),
                body.getCode(), body.getUuid());
        loginVo.setToken(token);
        // 兼容后台管理登录
        loginVo.setAccess_token(token);
        loginVo.setUserInfo(LoginHelper.getLoginUser());
        return R.ok(loginVo);
    }

//    /**
//     * 短信登录
//     *
//     * @param body 登录信息
//     * @return 结果
//     */
//    @PostMapping("/smsLogin")
//    public R<LoginVo> smsLogin(@Validated @RequestBody SmsLoginBody body) {

//    }

    /**
     * 访客登录
     * @param loginBody 登录信息
     * @return token信息
     */
    @PostMapping("/visitorLogin")
    public R<LoginVo> visitorLogin(@RequestBody VisitorLoginBody loginBody) {
        LoginVo loginVo = new LoginVo();
        return R.ok(loginVo);
    }

    /**
     * 退出登录
     */
    @PostMapping("/logout")
    public R<Void> logout() {
        loginService.logout();
        return R.ok("退出成功");
    }

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public R<Void> register(@Validated @RequestBody RegisterBody user, HttpServletRequest request) {
        String domainName =  request.getServerName();
        user.setDomainName(domainName);
        registerService.register(user);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @PostMapping("/reset/password")
    @SaIgnore
    public R<Void> resetPassWord(@Validated @RequestBody RegisterBody user) {
        registerService.resetPassWord(user);
        return R.ok();
    }

}
