package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 实时数据对象 box_data_real
 * 
 * @author ruoyi
 * @date 2024-01-13
 */
public class BoxDataReal extends BaseEntity
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

    /** 状态 */
    @Excel(name = "状态")
    private String state;

    /** 图标 */
    @Excel(name = "图标")
    private String icon;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String number;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String devicename;

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
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setDevicename(String devicename) 
    {
        this.devicename = devicename;
    }

    public String getDevicename() 
    {
        return devicename;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("boxname", getBoxname())
            .append("area", getArea())
            .append("state", getState())
            .append("icon", getIcon())
            .append("number", getNumber())
            .append("devicename", getDevicename())
            .append("manufacturer", getManufacturer())
            .append("produceyear", getProduceyear())
            .append("electricsctrreal", getElectricsctrreal())
            .append("lockreal", getLockreal())
            .append("networkreal", getNetworkreal())
            .append("cellreal", getCellreal())
            .append("volcurreal", getVolcurreal())
            .toString();
    }
}
