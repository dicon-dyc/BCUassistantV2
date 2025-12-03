package com.dicon.bcu.common.chat.entity.Tts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:55
 */
@Getter
@AllArgsConstructor
public enum TtsVoice {

    ALLOY("alloy"),
    ECHO("echo"),
    FABLE("fable"),
    ONYX("onyx"),
    NOVA("nova"),
    SHIMMER("shimmer"),
    ;

    private final String name;
}
