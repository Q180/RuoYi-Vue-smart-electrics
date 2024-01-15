package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BoxDataRealMapper;
import com.ruoyi.system.domain.BoxDataReal;
import com.ruoyi.system.service.IBoxDataRealService;

/**
 * 实时数据Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-13
 */
@Service
public class BoxDataRealServiceImpl implements IBoxDataRealService 
{
    @Autowired
    private BoxDataRealMapper boxDataRealMapper;

    /**
     * 查询实时数据
     * 
     * @param id 实时数据主键
     * @return 实时数据
     */
    @Override
    public BoxDataReal selectBoxDataRealById(String id)
    {
        return boxDataRealMapper.selectBoxDataRealById(id);
    }

    /**
     * 查询实时数据列表
     * 
     * @param boxDataReal 实时数据
     * @return 实时数据
     */
    @Override
    public List<BoxDataReal> selectBoxDataRealList(BoxDataReal boxDataReal)
    {
        return boxDataRealMapper.selectBoxDataRealList(boxDataReal);
    }

    /**
     * 新增实时数据
     * 
     * @param boxDataReal 实时数据
     * @return 结果
     */
    @Override
    public int insertBoxDataReal(BoxDataReal boxDataReal)
    {
        return boxDataRealMapper.insertBoxDataReal(boxDataReal);
    }

    /**
     * 修改实时数据
     * 
     * @param boxDataReal 实时数据
     * @return 结果
     */
    @Override
    public int updateBoxDataReal(BoxDataReal boxDataReal)
    {
        return boxDataRealMapper.updateBoxDataReal(boxDataReal);
    }

    /**
     * 批量删除实时数据
     * 
     * @param ids 需要删除的实时数据主键
     * @return 结果
     */
    @Override
    public int deleteBoxDataRealByIds(String[] ids)
    {
        return boxDataRealMapper.deleteBoxDataRealByIds(ids);
    }

    /**
     * 删除实时数据信息
     * 
     * @param id 实时数据主键
     * @return 结果
     */
    @Override
    public int deleteBoxDataRealById(String id)
    {
        return boxDataRealMapper.deleteBoxDataRealById(id);
    }
}
