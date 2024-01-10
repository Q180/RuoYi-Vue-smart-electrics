package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BusDataReal;

/**
 * 实时数据Service接口
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
public interface IBusDataRealService 
{
    /**
     * 查询实时数据
     * 
     * @param id 实时数据主键
     * @return 实时数据
     */
    public BusDataReal selectBusDataRealById(Long id);

    /**
     * 查询实时数据列表
     * 
     * @param busDataReal 实时数据
     * @return 实时数据集合
     */
    public List<BusDataReal> selectBusDataRealList(BusDataReal busDataReal);

    /**
     * 新增实时数据
     * 
     * @param busDataReal 实时数据
     * @return 结果
     */
    public int insertBusDataReal(BusDataReal busDataReal);

    /**
     * 修改实时数据
     * 
     * @param busDataReal 实时数据
     * @return 结果
     */
    public int updateBusDataReal(BusDataReal busDataReal);

    /**
     * 批量删除实时数据
     * 
     * @param ids 需要删除的实时数据主键集合
     * @return 结果
     */
    public int deleteBusDataRealByIds(Long[] ids);

    /**
     * 删除实时数据信息
     * 
     * @param id 实时数据主键
     * @return 结果
     */
    public int deleteBusDataRealById(Long id);
}
