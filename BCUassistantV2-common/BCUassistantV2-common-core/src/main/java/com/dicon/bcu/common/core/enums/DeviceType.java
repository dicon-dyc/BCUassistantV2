package com.dicon.bcu.common.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 设备类型
 *
 * @Author: dyc
 * @Create: 2025/11/25 18:27
 */
@Getter
@AllArgsConstructor
public enum DeviceType {

    /**
     * pc端
     */
    PC("pc"),

    /**
     * app端
     */
    APP("app"),

    /**
     * 小程序端
     */
    XCX("xcx");

    private final String device;

}
