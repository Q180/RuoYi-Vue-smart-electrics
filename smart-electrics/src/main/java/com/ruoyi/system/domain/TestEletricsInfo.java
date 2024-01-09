package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 test_eletrics_info
 * 
 * @author ruoyi
 * @date 2024-01-09
 */
public class TestEletricsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "id")
    private Long id;

    /** 配电箱编号 */
    @Excel(name = "配电箱编号")
    private Long eletricsId;

    /** 电箱商家 */
    @Excel(name = "电箱商家")
    private String eletricsSupplier;

    /** 电箱型号 */
    @Excel(name = "电箱型号")
    private String eletricsModel;

    /** 生产年份 */
    @Excel(name = "生产年份")
    private Long year;

    /** 生产月份ym */
    @Excel(name = "生产月份")
    private Long ymonth;

    /** 生产日期ymd */
    @Excel(name = "生产日期")
    private Long ymday;

    /** 经纬度位置 */
    @Excel(name = "经纬度位置")
    private Long latitudeLongitude;

    /** 是否启用（启用1、禁用0） */
    @Excel(name = "启用", readConverterExp = "启用1、禁用0")
    private String enable;

    /** 归属地 */
    @Excel(name = "归属地")
    private String homeLocation;

    /** 内部结构 */
    @Excel(name = "内部结构")
    private String interiorStructure;

    /** 网关通道 */
    @Excel(name = "网关通道")
    private String getwayChannel;

    /** 操作 */
    @Excel(name = "操作")
    private String operate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setEletricsId(Long eletricsId) 
    {
        this.eletricsId = eletricsId;
    }

    public Long getEletricsId() 
    {
        return eletricsId;
    }
    public void setEletricsSupplier(String eletricsSupplier) 
    {
        this.eletricsSupplier = eletricsSupplier;
    }

    public String getEletricsSupplier() 
    {
        return eletricsSupplier;
    }
    public void setEletricsModel(String eletricsModel) 
    {
        this.eletricsModel = eletricsModel;
    }

    public String getEletricsModel() 
    {
        return eletricsModel;
    }
    public void setYear(Long year) 
    {
        this.year = year;
    }

    public Long getYear() 
    {
        return year;
    }
    public void setYmonth(Long ymonth) 
    {
        this.ymonth = ymonth;
    }

    public Long getYmonth() 
    {
        return ymonth;
    }
    public void setYmday(Long ymday) 
    {
        this.ymday = ymday;
    }

    public Long getYmday() 
    {
        return ymday;
    }
    public void setLatitudeLongitude(Long latitudeLongitude) 
    {
        this.latitudeLongitude = latitudeLongitude;
    }

    public Long getLatitudeLongitude() 
    {
        return latitudeLongitude;
    }
    public void setEnable(String enable) 
    {
        this.enable = enable;
    }

    public String getEnable() 
    {
        return enable;
    }
    public void setHomeLocation(String homeLocation) 
    {
        this.homeLocation = homeLocation;
    }

    public String getHomeLocation() 
    {
        return homeLocation;
    }
    public void setInteriorStructure(String interiorStructure) 
    {
        this.interiorStructure = interiorStructure;
    }

    public String getInteriorStructure() 
    {
        return interiorStructure;
    }
    public void setGetwayChannel(String getwayChannel) 
    {
        this.getwayChannel = getwayChannel;
    }

    public String getGetwayChannel() 
    {
        return getwayChannel;
    }
    public void setOperate(String operate) 
    {
        this.operate = operate;
    }

    public String getOperate() 
    {
        return operate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("eletricsId", getEletricsId())
            .append("eletricsSupplier", getEletricsSupplier())
            .append("eletricsModel", getEletricsModel())
            .append("year", getYear())
            .append("ymonth", getYmonth())
            .append("ymday", getYmday())
            .append("latitudeLongitude", getLatitudeLongitude())
            .append("enable", getEnable())
            .append("homeLocation", getHomeLocation())
            .append("interiorStructure", getInteriorStructure())
            .append("getwayChannel", getGetwayChannel())
            .append("operate", getOperate())
            .toString();
    }
}
