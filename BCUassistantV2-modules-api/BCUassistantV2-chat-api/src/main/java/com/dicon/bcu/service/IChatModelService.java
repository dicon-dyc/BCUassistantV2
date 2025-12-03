package com.dicon.bcu.service;

import com.dicon.bcu.core.page.PageQuery;
import com.dicon.bcu.core.page.TableDataInfo;
import com.dicon.bcu.domain.ChatModel;
import com.dicon.bcu.domain.bo.ChatModelBo;
import com.dicon.bcu.domain.vo.ChatModelVo;

import java.util.Collection;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 00:14
 */
public interface IChatModelService {

    /**
     * 查询聊天模型
     */
    ChatModelVo queryById(Long id);

    /**
     * 查询聊天模型列表
     */
    TableDataInfo<ChatModelVo> queryPageList(ChatModelBo bo, PageQuery pageQuery);

    /**
     * 查询聊天模型列表
     */
    List<ChatModelVo> queryList(ChatModelBo bo);

    /**
     * 新增聊天模型
     */
    Boolean insertByBo(ChatModelBo bo);

    /**
     * 修改聊天模型
     */
    Boolean updateByBo(ChatModelBo bo);

    /**
     * 校验并批量删除聊天模型信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);


    /**
     * 通过模型名称获取模型信息
     */
    ChatModelVo selectModelByName(String modelName);
    /**
     * 通过模型分类获取模型信息
     */
    ChatModelVo selectModelByCategory(String image);

    /**
     * 通过模型分类获取优先级最高的模型信息
     */
    ChatModelVo selectModelByCategoryWithHighestPriority(String category);

    /**
     * 在同一分类下，查找优先级小于当前优先级的最高优先级模型（用于降级）。
     */
    ChatModelVo selectFallbackModelByCategoryAndLessPriority(String category, Integer currentPriority);

    /**
     * 获取ppt模型信息
     */
    ChatModel getPPT();

}