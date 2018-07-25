package com.oocl.parkinglotAPI.controller;

import com.oocl.parkinglotAPI.Service.ReceiptService;
import com.oocl.parkinglotAPI.model.Receipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {
    @Autowired
    public ReceiptService receiptService;

    @PostMapping(path= "/receipts")
    public Receipt generateReceipt(@RequestBody Receipt receipt){
        return receiptService.generateReceipt(receipt);
    }
}
