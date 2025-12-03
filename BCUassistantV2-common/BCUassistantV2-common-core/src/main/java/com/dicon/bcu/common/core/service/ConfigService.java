package com.dicon.bcu.common.core.service;

/**
 * @Author: dyc
 * @Create: 2025/12/2 22:58
 */

public interface ConfigService {

    /**
     * 根据配置类型和配置key获取值
     *
     * @param category
     * @param configKey
     * @return
     */
    String getConfigValue(String category,String configKey);



}
