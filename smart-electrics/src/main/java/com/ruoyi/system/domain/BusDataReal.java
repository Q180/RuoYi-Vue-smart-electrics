package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实时数据对象 bus_data_real
 * 
 * @author ruoyi
 * @date 2024-01-10
 */
public class BusDataReal extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long factorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String factorName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String oldValue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String value;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String unit;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String quality;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long updateDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long updateNum;

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
    public void setValue(String value) 
    {
        this.value = value;
    }

    public String getValue() 
    {
        return value;
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
    public void setUpdateDate(Long updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Long getUpdateDate() 
    {
        return updateDate;
    }
    public void setUpdateNum(Long updateNum) 
    {
        this.updateNum = updateNum;
    }

    public Long getUpdateNum() 
    {
        return updateNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("factorId", getFactorId())
            .append("factorName", getFactorName())
            .append("oldValue", getOldValue())
            .append("value", getValue())
            .append("unit", getUnit())
            .append("quality", getQuality())
            .append("updateDate", getUpdateDate())
            .append("updateNum", getUpdateNum())
            .toString();
    }
}
