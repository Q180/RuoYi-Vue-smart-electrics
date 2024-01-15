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
import com.ruoyi.system.domain.ElectricsInfo;
import com.ruoyi.system.service.IElectricsInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配电箱管理Controller
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@RestController
@RequestMapping("/devices/electrics_info")
public class ElectricsInfoController extends BaseController
{
    @Autowired
    private IElectricsInfoService electricsInfoService;

    /**
     * 查询配电箱管理列表
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricsInfo electricsInfo)
    {
        startPage();
        List<ElectricsInfo> list = electricsInfoService.selectElectricsInfoList(electricsInfo);
        return getDataTable(list);
    }

    /**
     * 导出配电箱管理列表
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:export')")
    @Log(title = "配电箱管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ElectricsInfo electricsInfo)
    {
        List<ElectricsInfo> list = electricsInfoService.selectElectricsInfoList(electricsInfo);
        ExcelUtil<ElectricsInfo> util = new ExcelUtil<ElectricsInfo>(ElectricsInfo.class);
        util.exportExcel(response, list, "配电箱管理数据");
    }

    /**
     * 获取配电箱管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(electricsInfoService.selectElectricsInfoById(id));
    }

    /**
     * 新增配电箱管理
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:add')")
    @Log(title = "配电箱管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricsInfo electricsInfo)
    {
        return toAjax(electricsInfoService.insertElectricsInfo(electricsInfo));
    }

    /**
     * 修改配电箱管理
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:edit')")
    @Log(title = "配电箱管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricsInfo electricsInfo)
    {
        return toAjax(electricsInfoService.updateElectricsInfo(electricsInfo));
    }

    /**
     * 删除配电箱管理
     */
    @PreAuthorize("@ss.hasPermi('devices:electrics_info:remove')")
    @Log(title = "配电箱管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(electricsInfoService.deleteElectricsInfoByIds(ids));
    }
}
