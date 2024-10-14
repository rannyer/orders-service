package com.example.micros.order_service.service;

import com.example.micros.order_service.dto.OrderRequest;
import com.example.micros.order_service.model.Order;
import com.example.micros.order_service.repository.OrderRepository;

import java.util.UUID;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void placeOrder(OrderRequest orderRequest){

        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

    }
}
