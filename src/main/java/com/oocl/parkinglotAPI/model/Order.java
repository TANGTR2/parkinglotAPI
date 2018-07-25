package com.oocl.parkinglotAPI.model;

import org.springframework.stereotype.Service;

@Service
public class Order {
    private int id;
    private String carId;
    private int pbId;
    public  boolean isValid = true;

    public Order(){}
    public Order(int id,String carId,boolean isValid){
        this.id = id;
        this.carId = carId;
        this.isValid = isValid;
    }
    public Order(int id,String carId,int pbId,boolean isValid){
        this.id = id;
        this.carId = carId;
        this.pbId = pbId;
        this.isValid = isValid;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCarId() { return carId; }
    public void setCarId(String carId) { this.carId = carId; }

    public int getPbId() { return pbId; }
    public void setPbId(int pbId) { this.pbId = pbId; }
}
