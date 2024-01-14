package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 历史数据对象 bus_data_history
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
public class BusDataHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 节点id */
    private Long id;

    /** 节点名称 */
    @Excel(name = "节点名称")
    private Long factorId;

    /** 原始信号值 */
    @Excel(name = "原始信号值")
    private String factorName;

    /** 信号值 */
    @Excel(name = "信号值")
    private String oldValue;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 质虽戳 */
    @Excel(name = "质虽戳")
    private String quality;

    /** 年 */
    @Excel(name = "年")
    private Long year;

    /** 月 */
    @Excel(name = "月")
    private Long ymont;

    /** 周 */
    @Excel(name = "周")
    private Long yweek;

    /** 天 */
    @Excel(name = "天")
    private Long yday;

    /** 时间 */
    @Excel(name = "时间")
    private Long ytime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFactorId(Long factorId) 
    {
        this.factorId = factorId;
    }

    public Long getFactorId() 
    {
        return factorId;
    }
    public void setFactorName(String factorName) 
    {
        this.factorName = factorName;
    }

    public String getFactorName() 
    {
        return factorName;
    }
    public void setOldValue(String oldValue) 
    {
        this.oldValue = oldValue;
    }

    public String getOldValue() 
    {
        return oldValue;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setQuality(String quality) 
    {
        this.quality = quality;
    }

    public String getQuality() 
    {
        return quality;
    }
    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }
    public void setYmont(Long ymont) 
    {
        this.ymont = ymont;
    }

    public Long getYmont() 
    {
        return ymont;
    }
    public void setYweek(Long yweek) 
    {
        this.yweek = yweek;
    }

    public Long getYweek() 
    {
        return yweek;
    }
    public void setYday(Long yday) 
    {
        this.yday = yday;
    }

    public Long getYday() 
    {
        return yday;
    }
    public void setYtime(Long ytime) 
    {
        this.ytime = ytime;
    }

    public Long getYtime() 
    {
        return ytime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("factorId", getFactorId())
            .append("factorName", getFactorName())
            .append("oldValue", getOldValue())
            .append("unit", getUnit())
            .append("quality", getQuality())
            .append("year", getYear())
            .append("ymont", getYmont())
            .append("yweek", getYweek())
            .append("yday", getYday())
            .append("ytime", getYtime())
            .toString();
    }
}
