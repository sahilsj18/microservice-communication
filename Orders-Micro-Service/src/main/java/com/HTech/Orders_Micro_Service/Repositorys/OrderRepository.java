package com.HTech.Orders_Micro_Service.Repositorys;

import com.HTech.Orders_Micro_Service.Models.Order;
import com.HTech.Orders_Micro_Service.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order,String> {
    Order findByUserId(String userId);
}
