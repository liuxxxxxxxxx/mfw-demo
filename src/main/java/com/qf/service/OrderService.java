package com.qf.service;

import com.qf.pojo.po.Order;
import com.qf.pojo.vo.OrderVO;

import java.util.List;

public interface OrderService {
    List<Order> listOrders(OrderVO orderVO);

    int countOrders(Order order);

    List<Order> getOrderByUid(String uid);

    Order getOrderByOid(String orderId);

    int updateOrderByOrder(Order order);

    int addOrderByOrder(Order order);

    int removeOrderByOid(String oid);
}
