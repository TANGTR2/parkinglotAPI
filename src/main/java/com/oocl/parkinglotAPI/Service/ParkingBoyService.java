package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.ParkingBoy;
import com.oocl.parkinglotAPI.model.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingBoyService {
    private ArrayList<ParkingBoy> parkingBoys = new ArrayList<>();
    {
        ParkingBoy parkingBoy1 = new ParkingBoy(1);
        parkingBoys.add(parkingBoy1);
    }

    public ArrayList<ParkingBoy> getParkingBoys() { return parkingBoys; }
    public void setParkingBoys(ArrayList<ParkingBoy> parkingBoys) { this.parkingBoys = parkingBoys; }

    public ParkingBoy postParkingBoys(ParkingBoy parkingBoy){
        ParkingBoy newParkingBoy = new ParkingBoy(
                parkingBoy.getPbId(),
                parkingBoy.getParkingLots()
        );
        parkingBoys.add(newParkingBoy);
        return newParkingBoy;
    }

    public ParkingBoy postParkingLotsToParkingBoy(ParkingLot parkingLot,int pbId) {
        for(ParkingBoy pb : parkingBoys){
            if(pb.getPbId() == pbId){
                pb.getParkingLots().add(parkingLot);
                return pb;
            }
        }
        return null;
    }
}
