package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ElectricsProject;

/**
 * 项目管理Service接口
 * 
 * @author yangkun
 * @date 2024-01-15
 */
public interface IElectricsProjectService 
{
    /**
     * 查询项目管理
     * 
     * @param id 项目管理主键
     * @return 项目管理
     */
    public ElectricsProject selectElectricsProjectById(String id);

    /**
     * 查询项目管理列表
     * 
     * @param electricsProject 项目管理
     * @return 项目管理集合
     */
    public List<ElectricsProject> selectElectricsProjectList(ElectricsProject electricsProject);

    /**
     * 新增项目管理
     * 
     * @param electricsProject 项目管理
     * @return 结果
     */
    public int insertElectricsProject(ElectricsProject electricsProject);

    /**
     * 修改项目管理
     * 
     * @param electricsProject 项目管理
     * @return 结果
     */
    public int updateElectricsProject(ElectricsProject electricsProject);

    /**
     * 批量删除项目管理
     * 
     * @param ids 需要删除的项目管理主键集合
     * @return 结果
     */
    public int deleteElectricsProjectByIds(String[] ids);

    /**
     * 删除项目管理信息
     * 
     * @param id 项目管理主键
     * @return 结果
     */
    public int deleteElectricsProjectById(String id);
}
