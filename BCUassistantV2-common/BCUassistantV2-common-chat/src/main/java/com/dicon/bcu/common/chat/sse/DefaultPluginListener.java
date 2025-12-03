package com.dicon.bcu.common.chat.sse;

import com.dicon.bcu.common.chat.entity.chat.ChatCompletion;
import com.dicon.bcu.common.chat.openai.OpenAiStreamClient;
import com.dicon.bcu.common.chat.openai.plugin.PluginAbstract;
import lombok.extern.slf4j.Slf4j;
import okhttp3.sse.EventSourceListener;

/**
 * @Author: dyc
 * @Create: 2025/12/2 22:27
 */
@Slf4j
public class DefaultPluginListener extends PluginListener {

    public DefaultPluginListener(OpenAiStreamClient client, EventSourceListener eventSourceListener, PluginAbstract plugin, ChatCompletion chatCompletion) {
        super(client, eventSourceListener, plugin, chatCompletion);
    }
}
