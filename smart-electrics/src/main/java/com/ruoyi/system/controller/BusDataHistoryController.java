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
import com.ruoyi.system.domain.BusDataHistory;
import com.ruoyi.system.service.IBusDataHistoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 历史数据Controller
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@RestController
@RequestMapping("/monitor/monitor_history")
public class BusDataHistoryController extends BaseController
{
    @Autowired
    private IBusDataHistoryService busDataHistoryService;

    /**
     * 查询历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusDataHistory busDataHistory)
    {
        startPage();
        List<BusDataHistory> list = busDataHistoryService.selectBusDataHistoryList(busDataHistory);
        return getDataTable(list);
    }

    /**
     * 导出历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:export')")
    @Log(title = "历史数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusDataHistory busDataHistory)
    {
        List<BusDataHistory> list = busDataHistoryService.selectBusDataHistoryList(busDataHistory);
        ExcelUtil<BusDataHistory> util = new ExcelUtil<BusDataHistory>(BusDataHistory.class);
        util.exportExcel(response, list, "历史数据数据");
    }

    /**
     * 获取历史数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(busDataHistoryService.selectBusDataHistoryById(id));
    }

    /**
     * 新增历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:add')")
    @Log(title = "历史数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusDataHistory busDataHistory)
    {
        return toAjax(busDataHistoryService.insertBusDataHistory(busDataHistory));
    }

    /**
     * 修改历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:edit')")
    @Log(title = "历史数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusDataHistory busDataHistory)
    {
        return toAjax(busDataHistoryService.updateBusDataHistory(busDataHistory));
    }

    /**
     * 删除历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:monitor_history:remove')")
    @Log(title = "历史数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(busDataHistoryService.deleteBusDataHistoryByIds(ids));
    }
}
