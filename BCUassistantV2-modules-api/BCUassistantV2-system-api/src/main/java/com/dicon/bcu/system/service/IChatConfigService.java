package com.dicon.bcu.system.service;

import com.dicon.bcu.core.page.PageQuery;
import com.dicon.bcu.core.page.TableDataInfo;
import com.dicon.bcu.system.domain.bo.ChatConfigBo;
import com.dicon.bcu.system.domain.vo.ChatConfigVo;

import java.util.Collection;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 12:19
 */
public interface IChatConfigService {

    /**
     * 查询配置信息
     */
    ChatConfigVo queryById(Long id);

    /**
     * 查询配置信息列表
     */
    TableDataInfo<ChatConfigVo> queryPageList(ChatConfigBo bo, PageQuery pageQuery);

    /**
     * 查询配置信息列表
     */
    List<ChatConfigVo> queryList(ChatConfigBo bo);

    /**
     * 新增配置信息
     */
    Boolean insertByBo(ChatConfigBo bo);

    /**
     * 修改配置信息
     */
    Boolean updateByBo(ChatConfigBo bo);

    /**
     * 校验并批量删除配置信息信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);


    /**
     * 查询系统参数
     */
    List<ChatConfigVo> getSysConfigValue(String category);
}
