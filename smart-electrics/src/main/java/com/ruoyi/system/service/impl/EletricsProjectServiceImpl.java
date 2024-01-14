package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EletricsProjectMapper;
import com.ruoyi.system.domain.EletricsProject;
import com.ruoyi.system.service.IEletricsProjectService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@Service
public class EletricsProjectServiceImpl implements IEletricsProjectService 
{
    @Autowired
    private EletricsProjectMapper eletricsProjectMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public EletricsProject selectEletricsProjectById(Long id)
    {
        return eletricsProjectMapper.selectEletricsProjectById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<EletricsProject> selectEletricsProjectList(EletricsProject eletricsProject)
    {
        return eletricsProjectMapper.selectEletricsProjectList(eletricsProject);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertEletricsProject(EletricsProject eletricsProject)
    {
        eletricsProject.setCreateTime(DateUtils.getNowDate());
        return eletricsProjectMapper.insertEletricsProject(eletricsProject);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateEletricsProject(EletricsProject eletricsProject)
    {
        return eletricsProjectMapper.updateEletricsProject(eletricsProject);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEletricsProjectByIds(Long[] ids)
    {
        return eletricsProjectMapper.deleteEletricsProjectByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteEletricsProjectById(Long id)
    {
        return eletricsProjectMapper.deleteEletricsProjectById(id);
    }
}
