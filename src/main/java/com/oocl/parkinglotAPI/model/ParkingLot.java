package com.oocl.parkinglotAPI.model;

import org.springframework.stereotype.Service;

@Service
public class ParkingLot {
    private int plId;
    private String plName;
    private int plSize;
    public ParkingLot(){}

    public ParkingLot(int plId, String plName, int plSize){
        this.plId = plId;
        this.plName = plName;
        this.plSize = plSize;
    }

    public int getPlId() { return plId; }
    public void setPlId(int plId) { this.plId = plId; }

    public String getPlName() { return plName; }
    public void setPlName(String plName) { this.plName = plName; }

    public int getPlSize() { return plSize; }
    public void setPlSize(int plSize) { this.plSize = plSize; }
}
