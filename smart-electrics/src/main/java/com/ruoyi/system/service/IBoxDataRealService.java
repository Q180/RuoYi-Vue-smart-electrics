package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BoxDataReal;

/**
 * 实时数据Service接口
 * 
 * @author ruoyi
 * @date 2024-01-13
 */
public interface IBoxDataRealService 
{
    /**
     * 查询实时数据
     * 
     * @param id 实时数据主键
     * @return 实时数据
     */
    public BoxDataReal selectBoxDataRealById(String id);

    /**
     * 查询实时数据列表
     * 
     * @param boxDataReal 实时数据
     * @return 实时数据集合
     */
    public List<BoxDataReal> selectBoxDataRealList(BoxDataReal boxDataReal);

    /**
     * 新增实时数据
     * 
     * @param boxDataReal 实时数据
     * @return 结果
     */
    public int insertBoxDataReal(BoxDataReal boxDataReal);

    /**
     * 修改实时数据
     * 
     * @param boxDataReal 实时数据
     * @return 结果
     */
    public int updateBoxDataReal(BoxDataReal boxDataReal);

    /**
     * 批量删除实时数据
     * 
     * @param ids 需要删除的实时数据主键集合
     * @return 结果
     */
    public int deleteBoxDataRealByIds(String[] ids);

    /**
     * 删除实时数据信息
     * 
     * @param id 实时数据主键
     * @return 结果
     */
    public int deleteBoxDataRealById(String id);
}
