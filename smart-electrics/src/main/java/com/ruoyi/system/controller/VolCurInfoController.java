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
import com.ruoyi.system.domain.VolCurInfo;
import com.ruoyi.system.service.IVolCurInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电压电流节点Controller
 * 
 * @author yangkun
 * @date 2024-01-14
 */
@RestController
@RequestMapping("/devices/vol_cur_info")
public class VolCurInfoController extends BaseController
{
    @Autowired
    private IVolCurInfoService volCurInfoService;

    /**
     * 查询电压电流节点列表
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:list')")
    @GetMapping("/list")
    public TableDataInfo list(VolCurInfo volCurInfo)
    {
        startPage();
        List<VolCurInfo> list = volCurInfoService.selectVolCurInfoList(volCurInfo);
        return getDataTable(list);
    }

    /**
     * 导出电压电流节点列表
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:export')")
    @Log(title = "电压电流节点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VolCurInfo volCurInfo)
    {
        List<VolCurInfo> list = volCurInfoService.selectVolCurInfoList(volCurInfo);
        ExcelUtil<VolCurInfo> util = new ExcelUtil<VolCurInfo>(VolCurInfo.class);
        util.exportExcel(response, list, "电压电流节点数据");
    }

    /**
     * 获取电压电流节点详细信息
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(volCurInfoService.selectVolCurInfoById(id));
    }

    /**
     * 新增电压电流节点
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:add')")
    @Log(title = "电压电流节点", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VolCurInfo volCurInfo)
    {
        return toAjax(volCurInfoService.insertVolCurInfo(volCurInfo));
    }

    /**
     * 修改电压电流节点
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:edit')")
    @Log(title = "电压电流节点", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VolCurInfo volCurInfo)
    {
        return toAjax(volCurInfoService.updateVolCurInfo(volCurInfo));
    }

    /**
     * 删除电压电流节点
     */
    @PreAuthorize("@ss.hasPermi('devices:vol_cur_info:remove')")
    @Log(title = "电压电流节点", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(volCurInfoService.deleteVolCurInfoByIds(ids));
    }
}
