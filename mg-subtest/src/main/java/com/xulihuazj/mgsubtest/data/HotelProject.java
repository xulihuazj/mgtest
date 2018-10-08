package com.xulihuazj.mgsubtest.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 社区实体类
 * <p>ClassName：User</>
 * <p>Description：社区实体类</p>
 * @author xulihua
 */
public class HotelProject implements Serializable {

    private static final long serialVersionUID = -1581946024445886578L;

    // 社区ID
    @Id
    @Indexed(direction = IndexDirection.ASCENDING)
    private Long projectId;

    // 社区类型
    @Field
    private String projectType;

    // 社区名称
    @Field
    @Indexed(direction = IndexDirection.ASCENDING)
    private String projectName;

    // 社区地址
    @Field
    private String projectAddress;

    // 社区经度
    @Field
    private Double latitude;

    // 社区纬度
    @Field
    private Double longitude;

    // 省份
    @Field
    private String province;

    // 城市
    @Field
    private String city;

    // 社区状态
    @Field
    private String projectStatus;

    // 开始时间
    @Field
    private Date createTime;

    // 最后修改时间
    @Field
    private Date lastModifyTime;

    // 单元
    private List<HotelUnit> hotelUnits;

    public List<HotelUnit> getHotelUnits() {
        return hotelUnits;
    }

    public void setHotelUnits(List<HotelUnit> hotelUnits) {
        this.hotelUnits = hotelUnits;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
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
