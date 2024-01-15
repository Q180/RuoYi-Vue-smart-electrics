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
import com.ruoyi.system.domain.ElectricsProject;
import com.ruoyi.system.service.IElectricsProjectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目管理Controller
 * 
 * @author yangkun
 * @date 2024-01-15
 */
@RestController
@RequestMapping("/devices/project_ctrl")
public class ElectricsProjectController extends BaseController
{
    @Autowired
    private IElectricsProjectService electricsProjectService;

    /**
     * 查询项目管理列表
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:list')")
    @GetMapping("/list")
    public TableDataInfo list(ElectricsProject electricsProject)
    {
        startPage();
        List<ElectricsProject> list = electricsProjectService.selectElectricsProjectList(electricsProject);
        return getDataTable(list);
    }

    /**
     * 导出项目管理列表
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:export')")
    @Log(title = "项目管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ElectricsProject electricsProject)
    {
        List<ElectricsProject> list = electricsProjectService.selectElectricsProjectList(electricsProject);
        ExcelUtil<ElectricsProject> util = new ExcelUtil<ElectricsProject>(ElectricsProject.class);
        util.exportExcel(response, list, "项目管理数据");
    }

    /**
     * 获取项目管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(electricsProjectService.selectElectricsProjectById(id));
    }

    /**
     * 新增项目管理
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:add')")
    @Log(title = "项目管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ElectricsProject electricsProject)
    {
        return toAjax(electricsProjectService.insertElectricsProject(electricsProject));
    }

    /**
     * 修改项目管理
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:edit')")
    @Log(title = "项目管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ElectricsProject electricsProject)
    {
        return toAjax(electricsProjectService.updateElectricsProject(electricsProject));
    }

    /**
     * 删除项目管理
     */
    @PreAuthorize("@ss.hasPermi('devices:project_ctrl:remove')")
    @Log(title = "项目管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(electricsProjectService.deleteElectricsProjectByIds(ids));
    }
}
