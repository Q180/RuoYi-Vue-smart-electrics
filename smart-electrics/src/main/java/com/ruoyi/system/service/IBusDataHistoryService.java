package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BusDataHistory;

/**
 * 历史数据Service接口
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
public interface IBusDataHistoryService 
{
    /**
     * 查询历史数据
     * 
     * @param id 历史数据主键
     * @return 历史数据
     */
    public BusDataHistory selectBusDataHistoryById(Long id);

    /**
     * 查询历史数据列表
     * 
     * @param busDataHistory 历史数据
     * @return 历史数据集合
     */
    public List<BusDataHistory> selectBusDataHistoryList(BusDataHistory busDataHistory);

    /**
     * 新增历史数据
     * 
     * @param busDataHistory 历史数据
     * @return 结果
     */
    public int insertBusDataHistory(BusDataHistory busDataHistory);

    /**
     * 修改历史数据
     * 
     * @param busDataHistory 历史数据
     * @return 结果
     */
    public int updateBusDataHistory(BusDataHistory busDataHistory);

    /**
     * 批量删除历史数据
     * 
     * @param ids 需要删除的历史数据主键集合
     * @return 结果
     */
    public int deleteBusDataHistoryByIds(Long[] ids);

    /**
     * 删除历史数据信息
     * 
     * @param id 历史数据主键
     * @return 结果
     */
    public int deleteBusDataHistoryById(Long id);
}
