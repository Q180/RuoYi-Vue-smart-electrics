package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电压电流节点对象 vol_cur_info
 * 
 * @author yangkun
 * @date 2024-01-14
 */
public class VolCurInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private String id;

    /** 电压电流节点编号 */
    @Excel(name = "电压电流节点编号")
    private Long volCurId;

    /** 电箱编号 */
    @Excel(name = "电箱编号")
    private Long electricsId;

    /** A相电压 */
    @Excel(name = "A相电压")
    private Double volA;

    /** B相电压 */
    @Excel(name = "B相电压")
    private Double volB;

    /** C相电压 */
    @Excel(name = "C相电压")
    private Double volC;

    /** 平均相电压 */
    @Excel(name = "平均相电压")
    private Double avgVol;

    /** A相电流 */
    @Excel(name = "A相电流")
    private Double curA;

    /** B相电流 */
    @Excel(name = "B相电流")
    private Double curB;

    /** C相电流 */
    @Excel(name = "C相电流")
    private Double curC;

    /** 平均相电流 */
    @Excel(name = "平均相电流")
    private Double avgCur;

    /** AB线压 */
    @Excel(name = "AB线压")
    private Double volAB;

    /** BC线压 */
    @Excel(name = "BC线压")
    private Double volBC;

    /** CA线压 */
    @Excel(name = "CA线压")
    private Double volCA;

    /** 平均线电压 */
    @Excel(name = "平均线电压")
    private Double avglineVol;

    /** 总功率因素 */
    @Excel(name = "总功率因素")
    private Double allPowerFactor;

    /** 频率 */
    @Excel(name = "频率")
    private Long frequency;

    /** 正向有用功率 */
    @Excel(name = "正向有用功率")
    private Double forwardAblePower;

    /** A相有用功率 */
    @Excel(name = "A相有用功率")
    private Double ablePowera;

    /** B相有用功率 */
    @Excel(name = "B相有用功率")
    private Double ablePowerb;

    /** C相有用功率 */
    @Excel(name = "C相有用功率")
    private Double ablePowerc;

    /** 三相有用功率 */
    @Excel(name = "三相有用功率")
    private Double allAblePower;

    /** A相无用功率 */
    @Excel(name = "A相无用功率")
    private Double notPowera;

    /** B相无用功率 */
    @Excel(name = "B相无用功率")
    private Double notPowerb;

    /** C相无用功率 */
    @Excel(name = "C相无用功率")
    private Double notPowerc;

    /** 三相无用功率 */
    @Excel(name = "三相无用功率")
    private Double allNotPower;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setVolCurId(Long volCurId) 
    {
        this.volCurId = volCurId;
    }

    public Long getVolCurId() 
    {
        return volCurId;
    }
    public void setElectricsId(Long electricsId) 
    {
        this.electricsId = electricsId;
    }

    public Long getElectricsId() 
    {
        return electricsId;
    }
    public void setVolA(Double volA) 
    {
        this.volA = volA;
    }

    public Double getVolA() 
    {
        return volA;
    }
    public void setVolB(Double volB) 
    {
        this.volB = volB;
    }

    public Double getVolB() 
    {
        return volB;
    }
    public void setVolC(Double volC) 
    {
        this.volC = volC;
    }

    public Double getVolC() 
    {
        return volC;
    }
    public void setAvgVol(Double avgVol) 
    {
        this.avgVol = avgVol;
    }

    public Double getAvgVol() 
    {
        return avgVol;
    }
    public void setCurA(Double curA) 
    {
        this.curA = curA;
    }

    public Double getCurA() 
    {
        return curA;
    }
    public void setCurB(Double curB) 
    {
        this.curB = curB;
    }

    public Double getCurB() 
    {
        return curB;
    }
    public void setCurC(Double curC) 
    {
        this.curC = curC;
    }

    public Double getCurC() 
    {
        return curC;
    }
    public void setAvgCur(Double avgCur) 
    {
        this.avgCur = avgCur;
    }

    public Double getAvgCur() 
    {
        return avgCur;
    }
    public void setVolAB(Double volAB) 
    {
        this.volAB = volAB;
    }

    public Double getVolAB() 
    {
        return volAB;
    }
    public void setVolBC(Double volBC) 
    {
        this.volBC = volBC;
    }

    public Double getVolBC() 
    {
        return volBC;
    }
    public void setVolCA(Double volCA) 
    {
        this.volCA = volCA;
    }

    public Double getVolCA() 
    {
        return volCA;
    }
    public void setAvglineVol(Double avglineVol) 
    {
        this.avglineVol = avglineVol;
    }

    public Double getAvglineVol() 
    {
        return avglineVol;
    }
    public void setAllPowerFactor(Double allPowerFactor) 
    {
        this.allPowerFactor = allPowerFactor;
    }

    public Double getAllPowerFactor() 
    {
        return allPowerFactor;
    }
    public void setFrequency(Long frequency) 
    {
        this.frequency = frequency;
    }

    public Long getFrequency() 
    {
        return frequency;
    }
    public void setForwardAblePower(Double forwardAblePower) 
    {
        this.forwardAblePower = forwardAblePower;
    }

    public Double getForwardAblePower() 
    {
        return forwardAblePower;
    }
    public void setAblePowera(Double ablePowera) 
    {
        this.ablePowera = ablePowera;
    }

    public Double getAblePowera() 
    {
        return ablePowera;
    }
    public void setAblePowerb(Double ablePowerb) 
    {
        this.ablePowerb = ablePowerb;
    }

    public Double getAblePowerb() 
    {
        return ablePowerb;
    }
    public void setAblePowerc(Double ablePowerc) 
    {
        this.ablePowerc = ablePowerc;
    }

    public Double getAblePowerc() 
    {
        return ablePowerc;
    }
    public void setAllAblePower(Double allAblePower) 
    {
        this.allAblePower = allAblePower;
    }

    public Double getAllAblePower() 
    {
        return allAblePower;
    }
    public void setNotPowera(Double notPowera) 
    {
        this.notPowera = notPowera;
    }

    public Double getNotPowera() 
    {
        return notPowera;
    }
    public void setNotPowerb(Double notPowerb) 
    {
        this.notPowerb = notPowerb;
    }

    public Double getNotPowerb() 
    {
        return notPowerb;
    }
    public void setNotPowerc(Double notPowerc) 
    {
        this.notPowerc = notPowerc;
    }

    public Double getNotPowerc() 
    {
        return notPowerc;
    }
    public void setAllNotPower(Double allNotPower) 
    {
        this.allNotPower = allNotPower;
    }

    public Double getAllNotPower() 
    {
        return allNotPower;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("volCurId", getVolCurId())
            .append("electricsId", getElectricsId())
            .append("volA", getVolA())
            .append("volB", getVolB())
            .append("volC", getVolC())
            .append("avgVol", getAvgVol())
            .append("curA", getCurA())
            .append("curB", getCurB())
            .append("curC", getCurC())
            .append("avgCur", getAvgCur())
            .append("volAB", getVolAB())
            .append("volBC", getVolBC())
            .append("volCA", getVolCA())
            .append("avglineVol", getAvglineVol())
            .append("allPowerFactor", getAllPowerFactor())
            .append("frequency", getFrequency())
            .append("forwardAblePower", getForwardAblePower())
            .append("ablePowera", getAblePowera())
            .append("ablePowerb", getAblePowerb())
            .append("ablePowerc", getAblePowerc())
            .append("allAblePower", getAllAblePower())
            .append("notPowera", getNotPowera())
            .append("notPowerb", getNotPowerb())
            .append("notPowerc", getNotPowerc())
            .append("allNotPower", getAllNotPower())
            .toString();
    }
}
