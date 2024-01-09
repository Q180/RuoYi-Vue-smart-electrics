package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestEletricsInfoMapper;
import com.ruoyi.system.domain.TestEletricsInfo;
import com.ruoyi.system.service.ITestEletricsInfoService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
@Service
public class TestEletricsInfoServiceImpl implements ITestEletricsInfoService 
{
    @Autowired
    private TestEletricsInfoMapper testEletricsInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TestEletricsInfo selectTestEletricsInfoById(Long id)
    {
        return testEletricsInfoMapper.selectTestEletricsInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TestEletricsInfo> selectTestEletricsInfoList(TestEletricsInfo testEletricsInfo)
    {
        return testEletricsInfoMapper.selectTestEletricsInfoList(testEletricsInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTestEletricsInfo(TestEletricsInfo testEletricsInfo)
    {
        return testEletricsInfoMapper.insertTestEletricsInfo(testEletricsInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param testEletricsInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTestEletricsInfo(TestEletricsInfo testEletricsInfo)
    {
        return testEletricsInfoMapper.updateTestEletricsInfo(testEletricsInfo);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTestEletricsInfoByIds(Long[] ids)
    {
        return testEletricsInfoMapper.deleteTestEletricsInfoByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTestEletricsInfoById(Long id)
    {
        return testEletricsInfoMapper.deleteTestEletricsInfoById(id);
    }
}
