package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusDataRealMapper;
import com.ruoyi.system.domain.BusDataReal;
import com.ruoyi.system.service.IBusDataRealService;

/**
 * 实时数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@Service
public class BusDataRealServiceImpl implements IBusDataRealService 
{
    @Autowired
    private BusDataRealMapper busDataRealMapper;

    /**
     * 查询实时数据
     * 
     * @param id 实时数据主键
     * @return 实时数据
     */
    @Override
    public BusDataReal selectBusDataRealById(Long id)
    {
        return busDataRealMapper.selectBusDataRealById(id);
    }

    /**
     * 查询实时数据列表
     * 
     * @param busDataReal 实时数据
     * @return 实时数据
     */
    @Override
    public List<BusDataReal> selectBusDataRealList(BusDataReal busDataReal)
    {
        return busDataRealMapper.selectBusDataRealList(busDataReal);
    }

    /**
     * 新增实时数据
     * 
     * @param busDataReal 实时数据
     * @return 结果
     */
    @Override
    public int insertBusDataReal(BusDataReal busDataReal)
    {
        return busDataRealMapper.insertBusDataReal(busDataReal);
    }

    /**
     * 修改实时数据
     * 
     * @param busDataReal 实时数据
     * @return 结果
     */
    @Override
    public int updateBusDataReal(BusDataReal busDataReal)
    {
        return busDataRealMapper.updateBusDataReal(busDataReal);
    }

    /**
     * 批量删除实时数据
     * 
     * @param ids 需要删除的实时数据主键
     * @return 结果
     */
    @Override
    public int deleteBusDataRealByIds(Long[] ids)
    {
        return busDataRealMapper.deleteBusDataRealByIds(ids);
    }

    /**
     * 删除实时数据信息
     * 
     * @param id 实时数据主键
     * @return 结果
     */
    @Override
    public int deleteBusDataRealById(Long id)
    {
        return busDataRealMapper.deleteBusDataRealById(id);
    }
}
