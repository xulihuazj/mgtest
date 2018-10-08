package com.xulihuazj.mgsubtest.repository.room;

import com.xulihuazj.mgsubtest.data.HotelProject;
import com.xulihuazj.mgsubtest.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepositoryImpl extends BaseRepositoryImpl<HotelProject> implements RoomRepository {

    @Override
    protected Class<HotelProject> getEntityClass() {
        return HotelProject.class;
    }
}
