package com.HTech.Orders_Micro_Service.Controllers;

import com.HTech.Orders_Micro_Service.Models.Order;
import com.HTech.Orders_Micro_Service.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping()
    public ResponseEntity<?> createOrder(@RequestBody Order order){
        if(order == null ){
            return new ResponseEntity<>("not created",HttpStatus.NOT_FOUND);
        }
        orderService.createOrder(order);
        return new ResponseEntity<>(order,HttpStatus.CREATED);
    }
    @GetMapping("/All-Orders")
    public ResponseEntity<List<Order>> GetAllOrders(){
        List<Order> Allorders=orderService.getAllorders();
        return  new ResponseEntity<>(Allorders,HttpStatus.OK);
    }
    @GetMapping("/{orderid}")
    public ResponseEntity<Order> getorderid(@PathVariable String orderid){
        Order order=orderService.getOrderid(orderid);
        return  new ResponseEntity<>(order,HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<Order> getOrderByUserId(@PathVariable String userId) {
        Order order = orderService.getOrderByUserId(userId);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
