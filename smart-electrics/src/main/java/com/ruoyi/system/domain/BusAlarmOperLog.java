package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * alarm-log对象 bus_alarm_oper_log
 * 
 * @author xingyuqiang
 * @date 2024-01-14
 */
public class BusAlarmOperLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 历史id */
    @Excel(name = "历史id")
    private String hisSnowId;

    /** 操作者id */
    @Excel(name = "操作者id")
    private Long operUserId;

    /** 操作者名称 */
    @Excel(name = "操作者名称")
    private String operUserName;

    /** 操作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date operTime;

    /** 操作类型(0新增，1确认，2取消，3忽略，4处理，5完成) */
    @Excel(name = "操作类型(0新增，1确认，2取消，3忽略，4处理，5完成)")
    private Long operType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHisSnowId(String hisSnowId) 
    {
        this.hisSnowId = hisSnowId;
    }

    public String getHisSnowId() 
    {
        return hisSnowId;
    }
    public void setOperUserId(Long operUserId) 
    {
        this.operUserId = operUserId;
    }

    public Long getOperUserId() 
    {
        return operUserId;
    }
    public void setOperUserName(String operUserName) 
    {
        this.operUserName = operUserName;
    }

    public String getOperUserName() 
    {
        return operUserName;
    }
    public void setOperTime(Date operTime) 
    {
        this.operTime = operTime;
    }

    public Date getOperTime() 
    {
        return operTime;
    }
    public void setOperType(Long operType) 
    {
        this.operType = operType;
    }

    public Long getOperType() 
    {
        return operType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hisSnowId", getHisSnowId())
            .append("operUserId", getOperUserId())
            .append("operUserName", getOperUserName())
            .append("operTime", getOperTime())
            .append("operType", getOperType())
            .toString();
    }
}
