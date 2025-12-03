package com.dicon.bcu.service;

import com.dicon.bcu.core.page.PageQuery;
import com.dicon.bcu.core.page.TableDataInfo;
import com.dicon.bcu.domain.bo.ChatSessionBo;
import com.dicon.bcu.domain.vo.ChatSessionVo;

import java.util.Collection;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 13:24
 */
public interface IChatSessionService {

    /**
     * 查询会话管理
     */
    ChatSessionVo queryById(Long id);

    /**
     * 查询会话管理列表
     */
    TableDataInfo<ChatSessionVo> queryPageList(ChatSessionBo bo, PageQuery pageQuery);

    /**
     * 查询会话管理列表
     */
    List<ChatSessionVo> queryList(ChatSessionBo bo);

    /**
     * 新增会话管理
     */
    Boolean insertByBo(ChatSessionBo bo);

    /**
     * 修改会话管理
     */
    Boolean updateByBo(ChatSessionBo bo);

    /**
     * 校验并批量删除会话管理信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
