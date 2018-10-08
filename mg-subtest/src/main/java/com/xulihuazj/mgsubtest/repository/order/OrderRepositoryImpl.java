package com.xulihuazj.mgsubtest.repository.order;

import com.xulihuazj.mgsubtest.data.OrderInfo;
import com.xulihuazj.mgsubtest.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl extends BaseRepositoryImpl<OrderInfo> implements OrderRepository {

    @Override
    protected Class<OrderInfo> getEntityClass() {
        Class<OrderInfo> orderInfoClass = OrderInfo.class;
        return orderInfoClass;
    }

}
