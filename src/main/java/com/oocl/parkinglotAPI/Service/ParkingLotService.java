package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingLotService {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    {
        ParkingLot parkingLot1 = new ParkingLot(1,"北方停车场",10);
        ParkingLot parkingLot2 = new ParkingLot(2,"南方停车场",5);
        parkingLots.add(parkingLot1);parkingLots.add(parkingLot2);
    }

    public ArrayList<ParkingLot> getParkingLots() { return parkingLots; }
    public void setParkingLots(ArrayList<ParkingLot> parkingLots) { this.parkingLots = parkingLots; }

    public ParkingLot buildParkingLot(ParkingLot parkingLot){
        ParkingLot newParkingLot = new ParkingLot(
                parkingLot.getPlId(),
                parkingLot.getPlName(),
                parkingLot.getPlSize()
        );
        parkingLots.add(newParkingLot);
        return newParkingLot;
    }
}
