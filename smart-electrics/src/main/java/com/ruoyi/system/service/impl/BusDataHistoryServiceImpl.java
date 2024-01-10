package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusDataHistoryMapper;
import com.ruoyi.system.domain.BusDataHistory;
import com.ruoyi.system.service.IBusDataHistoryService;

/**
 * 历史数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@Service
public class BusDataHistoryServiceImpl implements IBusDataHistoryService 
{
    @Autowired
    private BusDataHistoryMapper busDataHistoryMapper;

    /**
     * 查询历史数据
     * 
     * @param id 历史数据主键
     * @return 历史数据
     */
    @Override
    public BusDataHistory selectBusDataHistoryById(Long id)
    {
        return busDataHistoryMapper.selectBusDataHistoryById(id);
    }

    /**
     * 查询历史数据列表
     * 
     * @param busDataHistory 历史数据
     * @return 历史数据
     */
    @Override
    public List<BusDataHistory> selectBusDataHistoryList(BusDataHistory busDataHistory)
    {
        return busDataHistoryMapper.selectBusDataHistoryList(busDataHistory);
    }

    /**
     * 新增历史数据
     * 
     * @param busDataHistory 历史数据
     * @return 结果
     */
    @Override
    public int insertBusDataHistory(BusDataHistory busDataHistory)
    {
        return busDataHistoryMapper.insertBusDataHistory(busDataHistory);
    }

    /**
     * 修改历史数据
     * 
     * @param busDataHistory 历史数据
     * @return 结果
     */
    @Override
    public int updateBusDataHistory(BusDataHistory busDataHistory)
    {
        return busDataHistoryMapper.updateBusDataHistory(busDataHistory);
    }

    /**
     * 批量删除历史数据
     * 
     * @param ids 需要删除的历史数据主键
     * @return 结果
     */
    @Override
    public int deleteBusDataHistoryByIds(Long[] ids)
    {
        return busDataHistoryMapper.deleteBusDataHistoryByIds(ids);
    }

    /**
     * 删除历史数据信息
     * 
     * @param id 历史数据主键
     * @return 结果
     */
    @Override
    public int deleteBusDataHistoryById(Long id)
    {
        return busDataHistoryMapper.deleteBusDataHistoryById(id);
    }
}
