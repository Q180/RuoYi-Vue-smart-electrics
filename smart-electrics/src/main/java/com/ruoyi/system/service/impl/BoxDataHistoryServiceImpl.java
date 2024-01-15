package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BoxDataHistoryMapper;
import com.ruoyi.system.domain.BoxDataHistory;
import com.ruoyi.system.service.IBoxDataHistoryService;

/**
 * 历史数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@Service
public class BoxDataHistoryServiceImpl implements IBoxDataHistoryService 
{
    @Autowired
    private BoxDataHistoryMapper boxDataHistoryMapper;

    /**
     * 查询历史数据
     * 
     * @param id 历史数据主键
     * @return 历史数据
     */
    @Override
    public BoxDataHistory selectBoxDataHistoryById(String id)
    {
        return boxDataHistoryMapper.selectBoxDataHistoryById(id);
    }

    /**
     * 查询历史数据列表
     * 
     * @param boxDataHistory 历史数据
     * @return 历史数据
     */
    @Override
    public List<BoxDataHistory> selectBoxDataHistoryList(BoxDataHistory boxDataHistory)
    {
        return boxDataHistoryMapper.selectBoxDataHistoryList(boxDataHistory);
    }

    /**
     * 新增历史数据
     * 
     * @param boxDataHistory 历史数据
     * @return 结果
     */
    @Override
    public int insertBoxDataHistory(BoxDataHistory boxDataHistory)
    {
        return boxDataHistoryMapper.insertBoxDataHistory(boxDataHistory);
    }

    /**
     * 修改历史数据
     * 
     * @param boxDataHistory 历史数据
     * @return 结果
     */
    @Override
    public int updateBoxDataHistory(BoxDataHistory boxDataHistory)
    {
        return boxDataHistoryMapper.updateBoxDataHistory(boxDataHistory);
    }

    /**
     * 批量删除历史数据
     * 
     * @param ids 需要删除的历史数据主键
     * @return 结果
     */
    @Override
    public int deleteBoxDataHistoryByIds(String[] ids)
    {
        return boxDataHistoryMapper.deleteBoxDataHistoryByIds(ids);
    }

    /**
     * 删除历史数据信息
     * 
     * @param id 历史数据主键
     * @return 结果
     */
    @Override
    public int deleteBoxDataHistoryById(String id)
    {
        return boxDataHistoryMapper.deleteBoxDataHistoryById(id);
    }
}
