package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TestEletricsInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
@Mapper
public interface TestEletricsInfoMapper 
{
    /**
     * 查询【通过配电箱编号查询】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TestEletricsInfo selectTestEletricsInfoById(Long id);

    /**
     * 查询列表
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TestEletricsInfo> selectTestEletricsInfoList(TestEletricsInfo testEletricsInfo);

    /**
     * 新增【TestEletricsInfo包括各字段】
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertTestEletricsInfo(TestEletricsInfo testEletricsInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateTestEletricsInfo(TestEletricsInfo testEletricsInfo);

    /**
     * 删除【通过配电箱编号删除】
     * 
     * @param id
     * @return 结果
     */
    public int deleteTestEletricsInfoById(Long id);

    /**
     * 批量删除【通过配电箱编号删除】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestEletricsInfoByIds(Long[] ids);
}
