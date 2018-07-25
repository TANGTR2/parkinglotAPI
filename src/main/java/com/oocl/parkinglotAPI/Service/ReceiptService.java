package com.oocl.parkinglotAPI.Service;

import com.oocl.parkinglotAPI.model.Receipt;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService {
    public Receipt generateReceipt(Receipt receipt){
        Receipt newReceipt = new Receipt(
                receipt.getId(),
                receipt.isValid
        );
        return newReceipt;
    }
}
