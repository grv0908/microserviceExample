package com.example.otpMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gaurav Rajput
 * Created on 29/11/19
 */

@RestController
@RequestMapping("/private/otp")
public class OtpController {

    @GetMapping("/generate")
    public int generateOtp() {
        System.out.println("Successfully generated Otp");
        int otp = (int)(Math.random() * 100000);
        // save database

        return otp;
    }
}
