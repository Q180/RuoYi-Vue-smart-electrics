package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.BusAlarmOperLog;

/**
 * alarm-logService接口
 * 
 * @author xingyuqiang
 * @date 2024-01-14
 */
public interface IBusAlarmOperLogService 
{
    /**
     * 查询alarm-log
     * 
     * @param id alarm-log主键
     * @return alarm-log
     */
    public BusAlarmOperLog selectBusAlarmOperLogById(Long id);

    /**
     * 查询alarm-log列表
     * 
     * @param busAlarmOperLog alarm-log
     * @return alarm-log集合
     */
    public List<BusAlarmOperLog> selectBusAlarmOperLogList(BusAlarmOperLog busAlarmOperLog);

    /**
     * 新增alarm-log
     * 
     * @param busAlarmOperLog alarm-log
     * @return 结果
     */
    public int insertBusAlarmOperLog(BusAlarmOperLog busAlarmOperLog);

    /**
     * 修改alarm-log
     * 
     * @param busAlarmOperLog alarm-log
     * @return 结果
     */
    public int updateBusAlarmOperLog(BusAlarmOperLog busAlarmOperLog);

    /**
     * 批量删除alarm-log
     * 
     * @param ids 需要删除的alarm-log主键集合
     * @return 结果
     */
    public int deleteBusAlarmOperLogByIds(Long[] ids);

    /**
     * 删除alarm-log信息
     * 
     * @param id alarm-log主键
     * @return 结果
     */
    public int deleteBusAlarmOperLogById(Long id);
}
