package com.oocl.parkinglotAPI.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ParkingBoy {
    private int pbId;
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    public ParkingBoy(){ }

    public ParkingBoy(int pbId) {
        this.pbId = pbId;
    }

    public ParkingBoy(int pbId, ArrayList<ParkingLot> parkingLots){
        this.pbId = pbId;
        this.parkingLots = parkingLots;
    }

    public int getPbId() { return pbId; }
    public void setPbId(int pbId) { this.pbId = pbId; }

    public ArrayList<ParkingLot> getParkingLots() { return parkingLots; }
    public void setParkingLots(ArrayList<ParkingLot> parkingLots) { this.parkingLots = parkingLots; }
}
