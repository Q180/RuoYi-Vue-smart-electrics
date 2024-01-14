package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 eletrics_project
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
public class EletricsProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 项目名称 */
    @Excel(name = "项目名称")
    private String projectName;

    /** 备注 */
    @Excel(name = "备注")
    private String comment;

    /** 归属区 */
    @Excel(name = "归属区")
    private String homeLocation;

    @Excel(name = "创建时间")
    private String createTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
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

//    public String getTimeCreate(){return createTime;}
//
//    public void setTimeCreate(String createTime){this.createTime=createTime;
//    }

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
            .append("projectName", getProjectName())
            .append("comment", getComment())
            .append("createTime", getCreateTime())
            .append("homeLocation", getHomeLocation())
            .toString();
    }
}
