package com.example.form;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {
    public static void main(String[] args){
        BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder(12);

        String pass="1010";
        System.out.println( passwordEncoder.encode(pass));

    }
}
