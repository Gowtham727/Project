package com.example.exercise.controller;

import com.example.exercise.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Paymentcontroller {
    @Autowired
    Paymentservice service;
    @GetMapping("/upi")
    public String  getpaymentmethod()
    {
       return   service.getpaymentbyupi();
    }
    @GetMapping("/credit")
    public String getpaymetnbycreditcard()
    {
        return service.getpaymentbycredit();
    }
    @GetMapping("/debit")
    public String getpaymentbydebitcard()
    {
        return service.getpaymentbydebit();
    }
}
