package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 项目管理对象 electrics_project
 * 
 * @author yangkun
 * @date 2024-01-15
 */
public class ElectricsProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 项目编号 */
    @Excel(name = "项目编号")
    private Long projectId;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 备注 */
    @Excel(name = "备注")
    private String comment;

    /** 归属区 */
    @Excel(name = "归属区")
    private String homeLocation;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setProjectId(Long projectId) 
    {
        this.projectId = projectId;
    }

    public Long getProjectId() 
    {
        return projectId;
    }
    public void setProjectName(String projectName) 
    {
        this.projectName = projectName;
    }

    public String getProjectName() 
    {
        return projectName;
    }
    public void setComment(String comment) 
    {
        this.comment = comment;
    }

    public String getComment() 
    {
        return comment;
    }
    public void setHomeLocation(String homeLocation) 
    {
        this.homeLocation = homeLocation;
    }

    public String getHomeLocation() 
    {
        return homeLocation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectId", getProjectId())
            .append("projectName", getProjectName())
            .append("comment", getComment())
            .append("createTime", getCreateTime())
            .append("homeLocation", getHomeLocation())
            .toString();
    }
}
