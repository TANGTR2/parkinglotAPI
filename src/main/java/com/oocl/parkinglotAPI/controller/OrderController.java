package com.oocl.parkinglotAPI.controller;

import com.oocl.parkinglotAPI.Service.OrderService;
import com.oocl.parkinglotAPI.model.Order;
import com.oocl.parkinglotAPI.model.ParkingBoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;

    @PostMapping(path="/orders")
    public Order postOrder(@RequestBody Order order){
        return orderService.generateOrder(order);
    }

    @PutMapping(path="/orders/{id}")
    public Order alterOrder(@RequestBody ParkingBoy parkingBoy, @PathVariable int id){
        return orderService.acquireOrder(parkingBoy,id);
    }
}
