package com.example.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Paymentservice {
    public String  getpaymentbyupi() {
        return "payment initiated by upi";
    }
    public String getpaymentbycredit(){
        return "payment initiated by credit card";
    }
    public String getpaymentbydebit()
    {
        return "payment initiated by debit card";
    }
}
