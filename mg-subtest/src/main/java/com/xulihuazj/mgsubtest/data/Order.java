package com.xulihuazj.mgsubtest.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * 订单实体类
 * <p>ClassName：User<p/>
 * <p>Description：订单实体类<p/>
 * @author xulihua
 *
 */
@Document(collection = "order_info")
public class Order implements Serializable {

    private static final long serialVersionUID = -2305049382769475376L;

    @Id
    private Long orderId;

//    private

}
