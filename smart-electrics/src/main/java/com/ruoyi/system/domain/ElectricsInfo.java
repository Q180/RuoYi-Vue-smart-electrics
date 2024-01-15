package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 配电箱管理对象 electrics_info
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
public class ElectricsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 配电箱编号 */
    @Excel(name = "配电箱编号")
    private Long electricsId;

    /** 电箱商家 */
    @Excel(name = "电箱商家")
    private String electricsSupplier;

    /** 电箱型号 */
    @Excel(name = "电箱型号")
    private String electricsModel;

    /** 生产日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "生产日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 经纬度位置 */
    @Excel(name = "经纬度位置")
    private Double latitudeLongitude;

    /** 启用 */
    @Excel(name = "启用")
    private Boolean enable;

    /** 归属地 */
    @Excel(name = "归属地")
    private String homeLocation;

    /** 内部结构 */
    @Excel(name = "内部结构")
    private String interiorStructure;

    /** 网关通道 */
    @Excel(name = "网关通道")
    private String getwayChannel;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setElectricsId(Long electricsId) 
    {
        this.electricsId = electricsId;
    }

    public Long getElectricsId() 
    {
        return electricsId;
    }
    public void setElectricsSupplier(String electricsSupplier) 
    {
        this.electricsSupplier = electricsSupplier;
    }

    public String getElectricsSupplier() 
    {
        return electricsSupplier;
    }
    public void setElectricsModel(String electricsModel) 
    {
        this.electricsModel = electricsModel;
    }

    public String getElectricsModel() 
    {
        return electricsModel;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setLatitudeLongitude(Double latitudeLongitude) 
    {
        this.latitudeLongitude = latitudeLongitude;
    }

    public Double getLatitudeLongitude() 
    {
        return latitudeLongitude;
    }
    public void setEnable(Boolean enable) 
    {
        this.enable = enable;
    }

    public Boolean getEnable() 
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("electricsId", getElectricsId())
            .append("electricsSupplier", getElectricsSupplier())
            .append("electricsModel", getElectricsModel())
            .append("date", getDate())
            .append("latitudeLongitude", getLatitudeLongitude())
            .append("enable", getEnable())
            .append("homeLocation", getHomeLocation())
            .append("interiorStructure", getInteriorStructure())
            .append("getwayChannel", getGetwayChannel())
            .toString();
    }
}
