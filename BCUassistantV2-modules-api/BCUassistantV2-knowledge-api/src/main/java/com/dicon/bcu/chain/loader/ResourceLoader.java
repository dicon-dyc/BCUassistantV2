package com.dicon.bcu.chain.loader;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:42
 */
public interface ResourceLoader {

    String getContent(InputStream inputStream);

    List<String> getChunkList(String content, String kid);
}

