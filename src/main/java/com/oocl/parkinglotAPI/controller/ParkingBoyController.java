package com.oocl.parkinglotAPI.controller;

import com.oocl.parkinglotAPI.Service.ParkingBoyService;
import com.oocl.parkinglotAPI.model.ParkingBoy;
import com.oocl.parkinglotAPI.model.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ParkingBoyController {
    @Autowired
    public ParkingBoyService parkingBoyService;

    @GetMapping(path= "/parkingBoys")
    public ArrayList<ParkingBoy> getAllParkingBoys(){
        return parkingBoyService.getParkingBoys();
    }

    @PostMapping(path= "/parkingBoys")
    public ParkingBoy postParkingBoys(@RequestBody ParkingBoy parkingBoy){
        return parkingBoyService.postParkingBoys(parkingBoy);
    }

    @PostMapping(path= "/parkingBoys/{pbId}/parkingLots")
    public ParkingBoy postParkingLotsToParkingBoy(@RequestBody ParkingLot parkingLot, @PathVariable int pbId){
        return parkingBoyService.postParkingLotsToParkingBoy(parkingLot,pbId);
    }

    @GetMapping(path="/parkingBoys/{pbId}")
    public ArrayList<ParkingLot> selectParkingLotsFromTheParkingBoy(@PathVariable int pbId){
        return parkingBoyService.selectParkingLots(pbId);
    }
}
