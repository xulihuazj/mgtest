package com.xulihuazj.mgsubtest.data;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 楼栋单元实体类
 * <p>ClassName：User</>
 * <p>Description：楼栋单元实体类</p>
 * @author xulihua
 */
public class HotelUnit implements Serializable {

    private static final long serialVersionUID = -2720177507699073465L;

    private Long unitId;

    // 社区ID
    @Field
    private Long projectId;

    // 单元名称
    @Field
    @Indexed(direction = IndexDirection.ASCENDING)
    private String unitName;

    // 总楼层
    @Field
    private Integer totalFloor;

    // 状态
    @Field
    private String unitStatus;

    // 创建时间
    @Field
    private Date createTime;

    // 最后修改时间
    @Field
    private Date lastModifyTime;

    // 房间集合
    private List<HotelRoom> hotelRooms;

    public List<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(List<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(Integer totalFloor) {
        this.totalFloor = totalFloor;
    }

    public String getUnitStatus() {
        return unitStatus;
    }

    public void setUnitStatus(String unitStatus) {
        this.unitStatus = unitStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
