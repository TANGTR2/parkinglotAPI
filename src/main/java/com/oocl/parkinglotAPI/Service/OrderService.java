package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.Order;
import com.oocl.parkinglotAPI.model.ParkingBoy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private ArrayList<Order> orders = new ArrayList<>();
    public ArrayList<Order> getOrders() { return orders; }
    public void setOrders(ArrayList<Order> orders) { this.orders = orders; }

    public Order generateOrder(Order order){
        Order newOrder = new Order(
                order.getId(),
                order.getCarId(),
                order.getPbId(),
                order.isValid
        );
        orders.add(order);
        return newOrder;
    }

    public Order acquireOrder(ParkingBoy parkingBoy,int id){
        for(Order o :orders){
            if(o.getId() == id){
                o.setPbId(parkingBoy.getPbId());
                o.isValid = false;
                return o;
            }
        }
        return null;
    }
}
