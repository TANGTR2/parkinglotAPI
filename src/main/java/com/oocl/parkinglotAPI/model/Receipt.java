package com.oocl.parkinglotAPI.model;

import org.springframework.stereotype.Service;

@Service
public class Receipt {
    private int id;
    public boolean isValid = false;
    public Receipt(){}

    public Receipt(int id,boolean isValid){
        this.id = id;
        this.isValid = isValid;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

}
