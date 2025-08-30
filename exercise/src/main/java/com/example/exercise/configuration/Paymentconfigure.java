package com.example.exercise.configuration;

import com.example.exercise.service.Paymentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Paymentconfigure {
    @Autowired
    Paymentservice paymentservice;
    @Bean
    public String getpayment()
    {
        return paymentservice.getpaymentbyupi();
    }
    @Bean
    public String getbycredit()
    {
        return paymentservice.getpaymentbycredit();
    }
    @Bean
    public String getbydebit()
    {
        return paymentservice.getpaymentbydebit();
    }
}
