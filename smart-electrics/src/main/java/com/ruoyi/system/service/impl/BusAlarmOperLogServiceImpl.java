package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BusAlarmOperLogMapper;
import com.ruoyi.system.domain.BusAlarmOperLog;
import com.ruoyi.system.service.IBusAlarmOperLogService;

/**
 * alarm-logService业务层处理
 * 
 * @author xingyuqiang
 * @date 2024-01-14
 */
@Service
public class BusAlarmOperLogServiceImpl implements IBusAlarmOperLogService 
{
    @Autowired
    private BusAlarmOperLogMapper busAlarmOperLogMapper;

    /**
     * 查询alarm-log
     * 
     * @param id alarm-log主键
     * @return alarm-log
     */
    @Override
    public BusAlarmOperLog selectBusAlarmOperLogById(Long id)
    {
        return busAlarmOperLogMapper.selectBusAlarmOperLogById(id);
    }

    /**
     * 查询alarm-log列表
     * 
     * @param busAlarmOperLog alarm-log
     * @return alarm-log
     */
    @Override
    public List<BusAlarmOperLog> selectBusAlarmOperLogList(BusAlarmOperLog busAlarmOperLog)
    {
        return busAlarmOperLogMapper.selectBusAlarmOperLogList(busAlarmOperLog);
    }

    /**
     * 新增alarm-log
     * 
     * @param busAlarmOperLog alarm-log
     * @return 结果
     */
    @Override
    public int insertBusAlarmOperLog(BusAlarmOperLog busAlarmOperLog)
    {
        return busAlarmOperLogMapper.insertBusAlarmOperLog(busAlarmOperLog);
    }

    /**
     * 修改alarm-log
     * 
     * @param busAlarmOperLog alarm-log
     * @return 结果
     */
    @Override
    public int updateBusAlarmOperLog(BusAlarmOperLog busAlarmOperLog)
    {
        return busAlarmOperLogMapper.updateBusAlarmOperLog(busAlarmOperLog);
    }

    /**
     * 批量删除alarm-log
     * 
     * @param ids 需要删除的alarm-log主键
     * @return 结果
     */
    @Override
    public int deleteBusAlarmOperLogByIds(Long[] ids)
    {
        return busAlarmOperLogMapper.deleteBusAlarmOperLogByIds(ids);
    }

    /**
     * 删除alarm-log信息
     * 
     * @param id alarm-log主键
     * @return 结果
     */
    @Override
    public int deleteBusAlarmOperLogById(Long id)
    {
        return busAlarmOperLogMapper.deleteBusAlarmOperLogById(id);
    }
}
