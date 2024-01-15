package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.VolCurInfo;

/**
 * 电压电流节点Service接口
 * 
 * @author yangkun
 * @date 2024-01-14
 */
public interface IVolCurInfoService 
{
    /**
     * 查询电压电流节点
     * 
     * @param id 电压电流节点主键
     * @return 电压电流节点
     */
    public VolCurInfo selectVolCurInfoById(String id);

    /**
     * 查询电压电流节点列表
     * 
     * @param volCurInfo 电压电流节点
     * @return 电压电流节点集合
     */
    public List<VolCurInfo> selectVolCurInfoList(VolCurInfo volCurInfo);

    /**
     * 新增电压电流节点
     * 
     * @param volCurInfo 电压电流节点
     * @return 结果
     */
    public int insertVolCurInfo(VolCurInfo volCurInfo);

    /**
     * 修改电压电流节点
     * 
     * @param volCurInfo 电压电流节点
     * @return 结果
     */
    public int updateVolCurInfo(VolCurInfo volCurInfo);

    /**
     * 批量删除电压电流节点
     * 
     * @param ids 需要删除的电压电流节点主键集合
     * @return 结果
     */
    public int deleteVolCurInfoByIds(String[] ids);

    /**
     * 删除电压电流节点信息
     * 
     * @param id 电压电流节点主键
     * @return 结果
     */
    public int deleteVolCurInfoById(String id);
}
