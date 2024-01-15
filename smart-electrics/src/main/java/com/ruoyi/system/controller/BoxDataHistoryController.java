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
import com.ruoyi.system.domain.BoxDataHistory;
import com.ruoyi.system.service.IBoxDataHistoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 历史数据Controller
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@RestController
@RequestMapping("/monitor/BoxHistoryData")
public class BoxDataHistoryController extends BaseController
{
    @Autowired
    private IBoxDataHistoryService boxDataHistoryService;

    /**
     * 查询历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:list')")
    @GetMapping("/list")
    public TableDataInfo list(BoxDataHistory boxDataHistory)
    {
        startPage();
        List<BoxDataHistory> list = boxDataHistoryService.selectBoxDataHistoryList(boxDataHistory);
        return getDataTable(list);
    }

    /**
     * 导出历史数据列表
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:export')")
    @Log(title = "历史数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BoxDataHistory boxDataHistory)
    {
        List<BoxDataHistory> list = boxDataHistoryService.selectBoxDataHistoryList(boxDataHistory);
        ExcelUtil<BoxDataHistory> util = new ExcelUtil<BoxDataHistory>(BoxDataHistory.class);
        util.exportExcel(response, list, "历史数据数据");
    }

    /**
     * 获取历史数据详细信息
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(boxDataHistoryService.selectBoxDataHistoryById(id));
    }

    /**
     * 新增历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:add')")
    @Log(title = "历史数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BoxDataHistory boxDataHistory)
    {
        return toAjax(boxDataHistoryService.insertBoxDataHistory(boxDataHistory));
    }

    /**
     * 修改历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:edit')")
    @Log(title = "历史数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BoxDataHistory boxDataHistory)
    {
        return toAjax(boxDataHistoryService.updateBoxDataHistory(boxDataHistory));
    }

    /**
     * 删除历史数据
     */
    @PreAuthorize("@ss.hasPermi('monitor:BoxHistoryData:remove')")
    @Log(title = "历史数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(boxDataHistoryService.deleteBoxDataHistoryByIds(ids));
    }
}
