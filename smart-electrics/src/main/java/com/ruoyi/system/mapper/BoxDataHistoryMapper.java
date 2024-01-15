package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BoxDataHistory;
import org.apache.ibatis.annotations.Mapper;

/**
 * 历史数据Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@Mapper
public interface BoxDataHistoryMapper 
{
    /**
     * 查询历史数据
     * 
     * @param id 历史数据主键
     * @return 历史数据
     */
    public BoxDataHistory selectBoxDataHistoryById(String id);

    /**
     * 查询历史数据列表
     * 
     * @param boxDataHistory 历史数据
     * @return 历史数据集合
     */
    public List<BoxDataHistory> selectBoxDataHistoryList(BoxDataHistory boxDataHistory);

    /**
     * 新增历史数据
     * 
     * @param boxDataHistory 历史数据
     * @return 结果
     */
    public int insertBoxDataHistory(BoxDataHistory boxDataHistory);

    /**
     * 修改历史数据
     * 
     * @param boxDataHistory 历史数据
     * @return 结果
     */
    public int updateBoxDataHistory(BoxDataHistory boxDataHistory);

    /**
     * 删除历史数据
     * 
     * @param id 历史数据主键
     * @return 结果
     */
    public int deleteBoxDataHistoryById(String id);

    /**
     * 批量删除历史数据
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBoxDataHistoryByIds(String[] ids);
}
