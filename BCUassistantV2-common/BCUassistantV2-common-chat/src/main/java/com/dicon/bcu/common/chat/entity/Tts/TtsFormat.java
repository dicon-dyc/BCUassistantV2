package com.dicon.bcu.common.chat.entity.Tts;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: dyc
 * @Create: 2025/12/2 19:54
 */
@Getter
@AllArgsConstructor
public enum TtsFormat {
    MP3("mp3"),
    OPUS("opus"),
    AAC("aac"),
    FLAC("flac"),
    ;
    private final String name;
}
