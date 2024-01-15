package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ElectricsInfoMapper;
import com.ruoyi.system.domain.ElectricsInfo;
import com.ruoyi.system.service.IElectricsInfoService;

/**
 * 配电箱管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@Service
public class ElectricsInfoServiceImpl implements IElectricsInfoService 
{
    @Autowired
    private ElectricsInfoMapper electricsInfoMapper;

    /**
     * 查询配电箱管理
     * 
     * @param id 配电箱管理主键
     * @return 配电箱管理
     */
    @Override
    public ElectricsInfo selectElectricsInfoById(String id)
    {
        return electricsInfoMapper.selectElectricsInfoById(id);
    }

    /**
     * 查询配电箱管理列表
     * 
     * @param electricsInfo 配电箱管理
     * @return 配电箱管理
     */
    @Override
    public List<ElectricsInfo> selectElectricsInfoList(ElectricsInfo electricsInfo)
    {
        return electricsInfoMapper.selectElectricsInfoList(electricsInfo);
    }

    /**
     * 新增配电箱管理
     * 
     * @param electricsInfo 配电箱管理
     * @return 结果
     */
    @Override
    public int insertElectricsInfo(ElectricsInfo electricsInfo)
    {
        return electricsInfoMapper.insertElectricsInfo(electricsInfo);
    }

    /**
     * 修改配电箱管理
     * 
     * @param electricsInfo 配电箱管理
     * @return 结果
     */
    @Override
    public int updateElectricsInfo(ElectricsInfo electricsInfo)
    {
        return electricsInfoMapper.updateElectricsInfo(electricsInfo);
    }

    /**
     * 批量删除配电箱管理
     * 
     * @param ids 需要删除的配电箱管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricsInfoByIds(String[] ids)
    {
        return electricsInfoMapper.deleteElectricsInfoByIds(ids);
    }

    /**
     * 删除配电箱管理信息
     * 
     * @param id 配电箱管理主键
     * @return 结果
     */
    @Override
    public int deleteElectricsInfoById(String id)
    {
        return electricsInfoMapper.deleteElectricsInfoById(id);
    }
}
