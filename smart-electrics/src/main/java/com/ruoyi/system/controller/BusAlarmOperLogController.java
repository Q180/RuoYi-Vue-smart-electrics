package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.BusAlarmOperLog;
import com.ruoyi.system.service.IBusAlarmOperLogService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * alarm-logController
 * 
 * @author xingyuqiang
 * @date 2024-01-14
 */
@RestController
@RequestMapping("/log/alarm_log")
public class BusAlarmOperLogController extends BaseController
{
    @Autowired
    private IBusAlarmOperLogService busAlarmOperLogService;

    /**
     * 查询alarm-log列表
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusAlarmOperLog busAlarmOperLog)
    {
        startPage();
        List<BusAlarmOperLog> list = busAlarmOperLogService.selectBusAlarmOperLogList(busAlarmOperLog);
        return getDataTable(list);
    }

    /**
     * 导出alarm-log列表
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:export')")
    @Log(title = "alarm-log", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusAlarmOperLog busAlarmOperLog)
    {
        List<BusAlarmOperLog> list = busAlarmOperLogService.selectBusAlarmOperLogList(busAlarmOperLog);
        ExcelUtil<BusAlarmOperLog> util = new ExcelUtil<BusAlarmOperLog>(BusAlarmOperLog.class);
        util.exportExcel(response, list, "alarm_log数据");
    }

    /**
     * 获取alarm-log详细信息
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(busAlarmOperLogService.selectBusAlarmOperLogById(id));
    }

    /**
     * 新增alarm-log
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:add')")
    @Log(title = "alarm-log", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusAlarmOperLog busAlarmOperLog)
    {
        return toAjax(busAlarmOperLogService.insertBusAlarmOperLog(busAlarmOperLog));
    }

    /**
     * 修改alarm-log
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:edit')")
    @Log(title = "alarm-log", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusAlarmOperLog busAlarmOperLog)
    {
        return toAjax(busAlarmOperLogService.updateBusAlarmOperLog(busAlarmOperLog));
    }

    /**
     * 删除alarm-log
     */
    @PreAuthorize("@ss.hasPermi('log:alarm_log:remove')")
    @Log(title = "alarm-log", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(busAlarmOperLogService.deleteBusAlarmOperLogByIds(ids));
    }
}
