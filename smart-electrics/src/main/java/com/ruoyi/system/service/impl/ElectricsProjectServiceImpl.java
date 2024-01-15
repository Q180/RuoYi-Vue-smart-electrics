package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ElectricsProjectMapper;
import com.ruoyi.system.domain.ElectricsProject;
import com.ruoyi.system.service.IElectricsProjectService;

/**
 * 项目管理Service业务层处理
 * 
 * @author yangkun
 * @date 2024-01-15
 */
@Service
public class ElectricsProjectServiceImpl implements IElectricsProjectService 
{
    @Autowired
    private ElectricsProjectMapper electricsProjectMapper;

    /**
     * 查询项目管理
     * 
     * @param id 项目管理主键
     * @return 项目管理
     */
    @Override
    public ElectricsProject selectElectricsProjectById(String id)
    {
        return electricsProjectMapper.selectElectricsProjectById(id);
    }

    /**
     * 查询项目管理列表
     * 
     * @param electricsProject 项目管理
     * @return 项目管理
     */
    @Override
    public List<ElectricsProject> selectElectricsProjectList(ElectricsProject electricsProject)
    {
        return electricsProjectMapper.selectElectricsProjectList(electricsProject);
    }

    /**
     * 新增项目管理
     * 
     * @param electricsProject 项目管理
     * @return 结果
     */
    @Override
    public int insertElectricsProject(ElectricsProject electricsProject)
    {
        electricsProject.setCreateTime(DateUtils.getNowDate());
        return electricsProjectMapper.insertElectricsProject(electricsProject);
    }

    /**
     * 修改项目管理
     * 
     * @param electricsProject 项目管理
     * @return 结果
     */
    @Override
    public int updateElectricsProject(ElectricsProject electricsProject)
    {
        return electricsProjectMapper.updateElectricsProject(electricsProject);
    }

    /**
     * 批量删除项目管理
     * 
     * @param ids 需要删除的项目管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricsProjectByIds(String[] ids)
    {
        return electricsProjectMapper.deleteElectricsProjectByIds(ids);
    }

    /**
     * 删除项目管理信息
     * 
     * @param id 项目管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricsProjectById(String id)
    {
        return electricsProjectMapper.deleteElectricsProjectById(id);
    }
}
