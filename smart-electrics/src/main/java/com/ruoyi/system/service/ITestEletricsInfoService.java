package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestEletricsInfo;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
public interface ITestEletricsInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TestEletricsInfo selectTestEletricsInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TestEletricsInfo> selectTestEletricsInfoList(TestEletricsInfo testEletricsInfo);

    /**
     * 新增【请填写功能名称】
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
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTestEletricsInfoByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTestEletricsInfoById(Long id);
}
