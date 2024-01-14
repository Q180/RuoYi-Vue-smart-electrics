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
import com.ruoyi.system.domain.BusDataReal;
import com.ruoyi.system.service.IBusDataRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实时数据Controller
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
@RestController
@RequestMapping("/monitor/real")
public class BusDataRealController extends BaseController
{
    @Autowired
    private IBusDataRealService busDataRealService;

    /**
     * 查询实时数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:list')")
    @GetMapping("/list")
    public TableDataInfo list(BusDataReal busDataReal)
    {
        startPage();
        List<BusDataReal> list = busDataRealService.selectBusDataRealList(busDataReal);
        return getDataTable(list);
    }

    /**
     * 导出实时数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:export')")
    @Log(title = "实时数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BusDataReal busDataReal)
    {
        List<BusDataReal> list = busDataRealService.selectBusDataRealList(busDataReal);
        ExcelUtil<BusDataReal> util = new ExcelUtil<BusDataReal>(BusDataReal.class);
        util.exportExcel(response, list, "实时数据数据");
    }

    /**
     * 获取实时数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(busDataRealService.selectBusDataRealById(id));
    }

    /**
     * 新增实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:add')")
    @Log(title = "实时数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BusDataReal busDataReal)
    {
        return toAjax(busDataRealService.insertBusDataReal(busDataReal));
    }

    /**
     * 修改实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:edit')")
    @Log(title = "实时数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BusDataReal busDataReal)
    {
        return toAjax(busDataRealService.updateBusDataReal(busDataReal));
    }

    /**
     * 删除实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:real:remove')")
    @Log(title = "实时数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(busDataRealService.deleteBusDataRealByIds(ids));
    }
}
