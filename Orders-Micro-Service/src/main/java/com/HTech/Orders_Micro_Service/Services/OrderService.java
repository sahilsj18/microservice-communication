package com.HTech.Orders_Micro_Service.Services;

import com.HTech.Orders_Micro_Service.Models.Order;
import com.HTech.Orders_Micro_Service.Repositorys.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void createOrder(Order order) {
        orderRepository.save(order);
    }
    public List<Order> getAllorders(){
        return  orderRepository.findAll();
    }
    public Order getOrderid(String orderid){
        return  orderRepository.findById(orderid).orElse(null);
    }
    public Order getOrderByUserId(String userId) {
        return orderRepository.findByUserId(userId);
    }

}
