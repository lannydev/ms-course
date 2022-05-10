package com.microservices.hrpayroll.entities.services;

import com.microservices.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Diego", 200.0, days);
    }
}
