package com.xulihuazj.mgsubtest.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "hotel_room_info")
public class HotelRoom implements Serializable {

    private static final long serialVersionUID = 2273845184352652776L;

    @Id
    private Long hotelId;

    // 社区id
    @Field
    private Long projectId;

    // 房间类型
    @Field
    private String roomType;

    @Field
    // 社区名称
    private String hotelProjectName;

    @Field
    // 单元楼栋名称
    private String hotelUnitName;

    // 房间名称
    @Field
    @Indexed(direction = IndexDirection.ASCENDING)
    private String roomName;

    // 房间号
    @Field
    @Indexed(direction = IndexDirection.ASCENDING)
    private String roomNum;

    // 厅数
    @Field
    private Integer hallNum;

    // 厨房数
    @Field
    private Integer kitchenNum;

    // 卫生间数量
    @Field
    private Integer bathRoomNum;

    // 房间面积
    @Field
    private String roomArea;

    // 房间基价
    @Field
    private Integer basePrice;

    //所在楼层
    @Field
    private Integer floor;

    // 房间状态
    @Field
    private String roomStatus;

    // 创建者
    @Field
    private String creator;

    //创建时间
    @Field
    private Date createTime;

    //最后修改时间
    @Field
    private Date lastModifyTime;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelProjectName() {
        return hotelProjectName;
    }

    public void setHotelProjectName(String hotelProjectName) {
        this.hotelProjectName = hotelProjectName;
    }

    public String getHotelUnitName() {
        return hotelUnitName;
    }

    public void setHotelUnitName(String hotelUnitName) {
        this.hotelUnitName = hotelUnitName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getHallNum() {
        return hallNum;
    }

    public void setHallNum(Integer hallNum) {
        this.hallNum = hallNum;
    }

    public Integer getKitchenNum() {
        return kitchenNum;
    }

    public void setKitchenNum(Integer kitchenNum) {
        this.kitchenNum = kitchenNum;
    }

    public Integer getBathRoomNum() {
        return bathRoomNum;
    }

    public void setBathRoomNum(Integer bathRoomNum) {
        this.bathRoomNum = bathRoomNum;
    }

    public String getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(String roomArea) {
        this.roomArea = roomArea;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
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
