package com.dicon.bcu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dicon.bcu.common.core.utils.MapstructUtils;
import com.dicon.bcu.common.core.utils.StringUtils;
import com.dicon.bcu.common.satoken.utils.LoginHelper;
import com.dicon.bcu.core.page.PageQuery;
import com.dicon.bcu.core.page.TableDataInfo;
import com.dicon.bcu.domain.ChatMessage;
import com.dicon.bcu.domain.bo.ChatMessageBo;
import com.dicon.bcu.domain.vo.ChatMessageVo;
import com.dicon.bcu.mapper.ChatMessageMapper;
import com.dicon.bcu.service.IChatMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author: dyc
 * @Create: 2025/12/2 23:40
 */
@RequiredArgsConstructor
@Service
public class ChatMessageServiceImpl implements IChatMessageService {

    private final ChatMessageMapper baseMapper;

    /**
     * 查询聊天消息
     */
    @Override
    public ChatMessageVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询聊天消息列表
     */
    @Override
    public TableDataInfo<ChatMessageVo> queryPageList(ChatMessageBo bo, PageQuery pageQuery) {
        if(!LoginHelper.isLogin()){
            return TableDataInfo.build();
        }
        // 只有非管理员才自动设置为自己的 ID
        if (!LoginHelper.isSuperAdmin()) {
            bo.setUserId(LoginHelper.getUserId());
        }
        LambdaQueryWrapper<ChatMessage> lqw = buildQueryWrapper(bo);
        Page<ChatMessageVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询聊天消息列表
     */
    @Override
    public List<ChatMessageVo> queryList(ChatMessageBo bo) {
        LambdaQueryWrapper<ChatMessage> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ChatMessage> buildQueryWrapper(ChatMessageBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ChatMessage> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getUserId() != null, ChatMessage::getUserId, bo.getUserId());
        lqw.eq(StringUtils.isNotBlank(bo.getContent()), ChatMessage::getContent, bo.getContent());
        lqw.eq(bo.getSessionId() != null, ChatMessage::getSessionId, bo.getSessionId());
        lqw.like(StringUtils.isNotBlank(bo.getRole()), ChatMessage::getRole, bo.getRole());
        lqw.like(StringUtils.isNotBlank(bo.getModelName()), ChatMessage::getModelName, bo.getModelName());
        return lqw;
    }

    /**
     * 新增聊天消息
     */
    @Override
    public Boolean insertByBo(ChatMessageBo bo) {
        ChatMessage add = MapstructUtils.convert(bo, ChatMessage.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改聊天消息
     */
    @Override
    public Boolean updateByBo(ChatMessageBo bo) {
        ChatMessage update = MapstructUtils.convert(bo, ChatMessage.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ChatMessage entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除聊天消息
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}