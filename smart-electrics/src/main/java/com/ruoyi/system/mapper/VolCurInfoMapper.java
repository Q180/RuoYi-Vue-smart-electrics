package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.VolCurInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 电压电流节点Mapper接口
 * 
 * @author yangkun
 * @date 2024-01-14
 */
@Mapper
public interface VolCurInfoMapper 
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
     * 删除电压电流节点
     * 
     * @param id 电压电流节点主键
     * @return 结果
     */
    public int deleteVolCurInfoById(String id);

    /**
     * 批量删除电压电流节点
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVolCurInfoByIds(String[] ids);
}
