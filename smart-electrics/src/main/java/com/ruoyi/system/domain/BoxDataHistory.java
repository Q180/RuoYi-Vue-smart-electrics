package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 历史数据对象 box_data_history
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
public class BoxDataHistory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String id;

    /** 配电箱名称 */
    @Excel(name = "配电箱名称")
    private String boxname;

    /** 区域 */
    @Excel(name = "区域")
    private String area;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String number;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private String manufacturer;

    /** 生产年份 */
    @Excel(name = "生产年份")
    private String produceyear;

    /** 电控信息 */
    @Excel(name = "电控信息")
    private String electricsctrreal;

    /** 锁信息 */
    @Excel(name = "锁信息")
    private String lockreal;

    /** 网路信息 */
    @Excel(name = "网路信息")
    private String networkreal;

    /** 电池信息 */
    @Excel(name = "电池信息")
    private String cellreal;

    /** 电压电流信息 */
    @Excel(name = "电压电流信息")
    private String volcurreal;

    /** 记录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "记录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recordtime;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setBoxname(String boxname) 
    {
        this.boxname = boxname;
    }

    public String getBoxname() 
    {
        return boxname;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setManufacturer(String manufacturer) 
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() 
    {
        return manufacturer;
    }
    public void setProduceyear(String produceyear) 
    {
        this.produceyear = produceyear;
    }

    public String getProduceyear() 
    {
        return produceyear;
    }
    public void setElectricsctrreal(String electricsctrreal) 
    {
        this.electricsctrreal = electricsctrreal;
    }

    public String getElectricsctrreal() 
    {
        return electricsctrreal;
    }
    public void setLockreal(String lockreal) 
    {
        this.lockreal = lockreal;
    }

    public String getLockreal() 
    {
        return lockreal;
    }
    public void setNetworkreal(String networkreal) 
    {
        this.networkreal = networkreal;
    }

    public String getNetworkreal() 
    {
        return networkreal;
    }
    public void setCellreal(String cellreal) 
    {
        this.cellreal = cellreal;
    }

    public String getCellreal() 
    {
        return cellreal;
    }
    public void setVolcurreal(String volcurreal) 
    {
        this.volcurreal = volcurreal;
    }

    public String getVolcurreal() 
    {
        return volcurreal;
    }
    public void setRecordtime(Date recordtime) 
    {
        this.recordtime = recordtime;
    }

    public Date getRecordtime() 
    {
        return recordtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("boxname", getBoxname())
            .append("area", getArea())
            .append("number", getNumber())
            .append("manufacturer", getManufacturer())
            .append("produceyear", getProduceyear())
            .append("electricsctrreal", getElectricsctrreal())
            .append("lockreal", getLockreal())
            .append("networkreal", getNetworkreal())
            .append("cellreal", getCellreal())
            .append("volcurreal", getVolcurreal())
            .append("recordtime", getRecordtime())
            .toString();
    }
}
