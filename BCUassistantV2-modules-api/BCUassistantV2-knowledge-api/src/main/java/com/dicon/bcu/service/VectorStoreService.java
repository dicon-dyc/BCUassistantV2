package com.dicon.bcu.service;

import com.dicon.bcu.domain.bo.QueryVectorBo;
import com.dicon.bcu.domain.bo.StoreEmbeddingBo;

import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/2 22:50
 */
public interface VectorStoreService {

    void storeEmbeddings(StoreEmbeddingBo storeEmbeddingBo);

    List<String> getQueryVector(QueryVectorBo queryVectorBo);

    void createSchema(String kid,String modelName);

    void removeById(String id,String modelName);

    void removeByDocId(String docId, String kid);

    void removeByFid(String fid, String kid);
}
