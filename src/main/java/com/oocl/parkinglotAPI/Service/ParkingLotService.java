package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.Car;
import com.oocl.parkinglotAPI.model.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ParkingLotService {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    {
        ParkingLot parkingLot1 = new ParkingLot(1,"北方停车场",10);
        ParkingLot parkingLot2 = new ParkingLot(2,"南方停车场",5);
        ParkingLot parkingLot3 = new ParkingLot(3,"东方停车场",0);
        parkingLots.add(parkingLot1);parkingLots.add(parkingLot2);parkingLots.add(parkingLot3);
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

    public ArrayList<ParkingLot> deleteParkingLot(int plId) {
        for(ParkingLot p : parkingLots){
            if((p.getPlId() == plId) && (p.getPlSize()== 0)){
                parkingLots.remove(p);
                return parkingLots;
            }
        }return null;
    }

    public ParkingLot park(Car car) {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.getPlSize() > 0) {
                parkingLot.setPlSize(parkingLot.getPlSize() - 1);
                return parkingLot;
            }
        }
        return null;
    }

}
