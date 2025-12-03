package com.dicon.bcu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dicon.bcu.common.core.utils.MapstructUtils;
import com.dicon.bcu.common.core.utils.StringUtils;
import com.dicon.bcu.core.page.PageQuery;
import com.dicon.bcu.core.page.TableDataInfo;
import com.dicon.bcu.domain.PromptTemplate;
import com.dicon.bcu.domain.bo.PromptTemplateBo;
import com.dicon.bcu.domain.vo.PromptTemplateVo;
import com.dicon.bcu.mapper.PromptTemplateMapper;
import com.dicon.bcu.service.IPromptTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @Author: dyc
 * @Create: 2025/12/3 20:55
 */
@Service
@RequiredArgsConstructor
public class PromptTemplateServiceImpl implements IPromptTemplateService {

    private final PromptTemplateMapper baseMapper;

    /**
     * 查询提示词模板
     */
    @Override
    public PromptTemplateVo queryById(Long id) {
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询提示词模板列表
     */
    @Override
    public TableDataInfo<PromptTemplateVo> queryPageList(PromptTemplateBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<PromptTemplate> lqw = buildQueryWrapper(bo);
        Page<PromptTemplateVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询提示词模板列表
     */
    @Override
    public List<PromptTemplateVo> queryList(PromptTemplateBo bo) {
        LambdaQueryWrapper<PromptTemplate> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<PromptTemplate> buildQueryWrapper(PromptTemplateBo bo) {
        LambdaQueryWrapper<PromptTemplate> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getTemplateName()),
                PromptTemplate::getTemplateName, bo.getTemplateName());
        lqw.like(StringUtils.isNotBlank(bo.getTemplateContent()),
                PromptTemplate::getTemplateContent, bo.getTemplateContent());
        lqw.eq(StringUtils.isNotBlank(bo.getCategory()),
                PromptTemplate::getCategory, bo.getCategory());
        return lqw;
    }

    /**
     * 新增提示词模板
     */
    @Override
    public Boolean insertByBo(PromptTemplateBo bo) {
        PromptTemplate add = MapstructUtils.convert(bo, PromptTemplate.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改提示词模板
     */
    @Override
    public Boolean updateByBo(PromptTemplateBo bo) {
        PromptTemplate update = MapstructUtils.convert(bo, PromptTemplate.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(PromptTemplate entity) {
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除提示词模板
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if (isValid) {
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }

    @Override
    public PromptTemplateVo queryByCategory(String category) {
        LambdaQueryWrapper<PromptTemplate> queryWrapper = Wrappers.lambdaQuery(PromptTemplate.class);
        queryWrapper.eq(PromptTemplate::getCategory, category);
        queryWrapper.orderByDesc(PromptTemplate::getUpdateTime);
        queryWrapper.last("limit 1");
        return baseMapper.selectVoOne(queryWrapper);
    }
}
