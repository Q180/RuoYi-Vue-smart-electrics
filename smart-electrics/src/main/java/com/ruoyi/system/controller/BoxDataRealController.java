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
import com.ruoyi.system.domain.BoxDataReal;
import com.ruoyi.system.service.IBoxDataRealService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 实时数据Controller
 * 
 * @author ruoyi
 * @date 2024-01-13
 */
@RestController
@RequestMapping("/monitor/RealData")
public class BoxDataRealController extends BaseController
{
    @Autowired
    private IBoxDataRealService boxDataRealService;

    /**
     * 查询实时数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:list')")
    @GetMapping("/list")
    public TableDataInfo list(BoxDataReal boxDataReal)
    {
        startPage();
        List<BoxDataReal> list = boxDataRealService.selectBoxDataRealList(boxDataReal);
        return getDataTable(list);
    }

    /**
     * 导出实时数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:export')")
    @Log(title = "实时数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BoxDataReal boxDataReal)
    {
        List<BoxDataReal> list = boxDataRealService.selectBoxDataRealList(boxDataReal);
        ExcelUtil<BoxDataReal> util = new ExcelUtil<BoxDataReal>(BoxDataReal.class);
        util.exportExcel(response, list, "实时数据数据");
    }

    /**
     * 获取实时数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(boxDataRealService.selectBoxDataRealById(id));
    }

    /**
     * 新增实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:add')")
    @Log(title = "实时数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BoxDataReal boxDataReal)
    {
        return toAjax(boxDataRealService.insertBoxDataReal(boxDataReal));
    }

    /**
     * 修改实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:edit')")
    @Log(title = "实时数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BoxDataReal boxDataReal)
    {
        return toAjax(boxDataRealService.updateBoxDataReal(boxDataReal));
    }

    /**
     * 删除实时数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:RealData:remove')")
    @Log(title = "实时数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(boxDataRealService.deleteBoxDataRealByIds(ids));
    }
}
