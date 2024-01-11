package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.EletricsProject;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@Mapper
public interface EletricsProjectMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public EletricsProject selectEletricsProjectById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<EletricsProject> selectEletricsProjectList(EletricsProject eletricsProject);

    /**
     * 新增【请填写功能名称】
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 结果
     */
    public int insertEletricsProject(EletricsProject eletricsProject);

    /**
     * 修改【请填写功能名称】
     * 
     * @param eletricsProject 【请填写功能名称】
     * @return 结果
     */
    public int updateEletricsProject(EletricsProject eletricsProject);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteEletricsProjectById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEletricsProjectByIds(Long[] ids);
}
