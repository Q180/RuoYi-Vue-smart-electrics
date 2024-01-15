package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ElectricsInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 配电箱管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-14
 */
@Mapper
public interface ElectricsInfoMapper 
{
    /**
     * 查询配电箱管理
     * 
     * @param id 配电箱管理主键
     * @return 配电箱管理
     */
    public ElectricsInfo selectElectricsInfoById(String id);

    /**
     * 查询配电箱管理列表
     * 
     * @param electricsInfo 配电箱管理
     * @return 配电箱管理集合
     */
    public List<ElectricsInfo> selectElectricsInfoList(ElectricsInfo electricsInfo);

    /**
     * 新增配电箱管理
     * 
     * @param electricsInfo 配电箱管理
     * @return 结果
     */
    public int insertElectricsInfo(ElectricsInfo electricsInfo);

    /**
     * 修改配电箱管理
     * 
     * @param electricsInfo 配电箱管理
     * @return 结果
     */
    public int updateElectricsInfo(ElectricsInfo electricsInfo);

    /**
     * 删除配电箱管理
     * 
     * @param id 配电箱管理主键
     * @return 结果
     */
    public int deleteElectricsInfoById(String id);

    /**
     * 批量删除配电箱管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteElectricsInfoByIds(String[] ids);
}
