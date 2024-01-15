package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VolCurInfoMapper;
import com.ruoyi.system.domain.VolCurInfo;
import com.ruoyi.system.service.IVolCurInfoService;

/**
 * 电压电流节点Service业务层处理
 * 
 * @author yangkun
 * @date 2024-01-14
 */
@Service
public class VolCurInfoServiceImpl implements IVolCurInfoService 
{
    @Autowired
    private VolCurInfoMapper volCurInfoMapper;

    /**
     * 查询电压电流节点
     * 
     * @param id 电压电流节点主键
     * @return 电压电流节点
     */
    @Override
    public VolCurInfo selectVolCurInfoById(String id)
    {
        return volCurInfoMapper.selectVolCurInfoById(id);
    }

    /**
     * 查询电压电流节点列表
     * 
     * @param volCurInfo 电压电流节点
     * @return 电压电流节点
     */
    @Override
    public List<VolCurInfo> selectVolCurInfoList(VolCurInfo volCurInfo)
    {
        return volCurInfoMapper.selectVolCurInfoList(volCurInfo);
    }

    /**
     * 新增电压电流节点
     * 
     * @param volCurInfo 电压电流节点
     * @return 结果
     */
    @Override
    public int insertVolCurInfo(VolCurInfo volCurInfo)
    {
        return volCurInfoMapper.insertVolCurInfo(volCurInfo);
    }

    /**
     * 修改电压电流节点
     * 
     * @param volCurInfo 电压电流节点
     * @return 结果
     */
    @Override
    public int updateVolCurInfo(VolCurInfo volCurInfo)
    {
        return volCurInfoMapper.updateVolCurInfo(volCurInfo);
    }

    /**
     * 批量删除电压电流节点
     * 
     * @param ids 需要删除的电压电流节点主键
     * @return 结果
     */
    @Override
    public int deleteVolCurInfoByIds(String[] ids)
    {
        return volCurInfoMapper.deleteVolCurInfoByIds(ids);
    }

    /**
     * 删除电压电流节点信息
     * 
     * @param id 电压电流节点主键
     * @return 结果
     */
    @Override
    public int deleteVolCurInfoById(String id)
    {
        return volCurInfoMapper.deleteVolCurInfoById(id);
    }
}
