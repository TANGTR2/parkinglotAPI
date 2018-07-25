package com.oocl.parkinglotAPI.controller;

import com.oocl.parkinglotAPI.Service.ParkingLotService;
import com.oocl.parkinglotAPI.model.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ParkingLotController {

    @Autowired
    public ParkingLotService parkingLotService;

    @PostMapping(path = "/parkingLots")
    public ParkingLot postParkingLots(@RequestBody ParkingLot parkingLot){
        return parkingLotService.buildParkingLot(parkingLot);
    }

    @GetMapping(path = "/parkingLots")
    public ArrayList<ParkingLot> getAllParkingLots(){
        return parkingLotService.getParkingLots();
    }

}
