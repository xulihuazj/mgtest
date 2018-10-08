package com.xulihuazj.mgsubtest.repository.order;

import com.xulihuazj.mgsubtest.data.Order;
import com.xulihuazj.mgsubtest.repository.BaseRepositoryImpl;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryImpl<Order> extends BaseRepositoryImpl<Order> implements OrderRepository {
}
