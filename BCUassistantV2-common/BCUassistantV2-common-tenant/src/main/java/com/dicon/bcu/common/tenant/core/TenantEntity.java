package com.dicon.bcu.common.tenant.core;

import com.dicon.bcu.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 租户基类
 *
 * @Author: dyc
 * @Create: 2025/11/25 15:26
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TenantEntity extends BaseEntity {

    /**
     * 租户编号
     */
    private String tenantId;
}
