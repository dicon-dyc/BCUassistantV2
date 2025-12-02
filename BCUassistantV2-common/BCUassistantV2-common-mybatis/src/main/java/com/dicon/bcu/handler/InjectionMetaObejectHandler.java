package com.dicon.bcu.handler;

import com.dicon.bcu.common.core.domain.model.LoginUser;
import com.dicon.bcu.common.core.exception.ServiceException;
import com.dicon.bcu.common.core.service.BaseContext;
import com.dicon.bcu.common.core.utils.ObjectUtils;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.http.HttpStatus;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.dicon.bcu.core.domain.BaseEntity;
import com.dicon.bcu.common.satoken.utils.LoginHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * MP注入处理器
 *
 * @Author: dyc
 * @Create: 2025/11/25 16:03
 */
@Slf4j
public class InjectionMetaObejectHandler implements MetaObjectHandler
{
    /**
     * 插入填充
     *
     * @param metaObject 用于获取原始对象并进行填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        try {
            if(ObjectUtil.isNotNull(metaObject) && metaObject.getOriginalObject() instanceof BaseEntity baseEntity) {

                //获取当前时间作为创建和更新时间，如果创建时间不为空，则使用创建时间，否则使用当前时间
                Date current = ObjectUtils.notNull(baseEntity.getCreateTime(),new Date());
                baseEntity.setCreateTime(current);
                baseEntity.setUpdateTime(current);

                //如果创建人为空，则填充当前登录用户的信息
                if (ObjectUtil.isNull(baseEntity.getCreateBy())) {
                    LoginUser loginUser = getLoginUser();
                    if (ObjectUtil.isNotNull(loginUser)) {
                        Long userId = loginUser.getUserId();
                        // 填充创建人、更新人和创建部门信息
                        baseEntity.setCreateBy(userId);
                        baseEntity.setUpdateBy(userId);
                        baseEntity.setCreateDept(ObjectUtils.notNull(baseEntity.getCreateDept(), loginUser.getDeptId()));
                    }
                }

            }

        } catch (Exception e) {
            throw new ServiceException("自动注入异常 =》" + e.getMessage(), HttpStatus.HTTP_UNAUTHORIZED);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }

    /**
     * 获取当前登录用户信息
     *
     * @return 当前登录用户的信息，如果用户未登录则返回 null
     */
    private LoginUser getLoginUser() {
        LoginUser loginUser;
        try {
            String token = BaseContext.getCurrentToken();
            loginUser = LoginHelper.getLoginUser(token);
        } catch (Exception e) {
            log.warn("自动注入警告 => 用户未登录");
            return null;
        }
        return loginUser;
    }
}
