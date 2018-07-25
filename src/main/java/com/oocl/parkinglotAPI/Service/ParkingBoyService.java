package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.Car;
import com.oocl.parkinglotAPI.model.ParkingBoy;
import com.oocl.parkinglotAPI.model.ParkingLot;
import com.oocl.parkinglotAPI.model.Receipt;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class ParkingBoyService {
    private ArrayList<ParkingLot> parkingLots = new ArrayList<>();
    {
        ParkingLot parkingLot1 = new ParkingLot(1,"北方停车场",10);
        ParkingLot parkingLot2 = new ParkingLot(2,"南方停车场",5);
        parkingLots.add(parkingLot1);parkingLots.add(parkingLot2);
    }
    private ArrayList<ParkingBoy> parkingBoys = new ArrayList<>();
    {
        ParkingBoy parkingBoy1 = new ParkingBoy(1);
        ParkingBoy parkingBoy2 = new ParkingBoy(2,parkingLots);
        parkingBoys.add(parkingBoy1);parkingBoys.add(parkingBoy2);
    }

    private Map<Receipt, Car> parkedCars = new HashMap<>();
    public void setParkedCars(Map<Receipt, Car> parkedCars) {
        this.parkedCars = parkedCars;
    }
    public Map<Receipt, Car> getParkedCars() {
        return parkedCars;
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

    public ArrayList<ParkingLot> selectParkingLots(int pbId) {
        for(ParkingBoy boy : parkingBoys){
            if(boy.getPbId() == pbId)
                return boy.getParkingLots();
        }
        return null;
    }

    public Receipt parking(Car car) {
        Receipt key = new Receipt();
        this.parkedCars.put(key, car);
        return key;
    }
}
