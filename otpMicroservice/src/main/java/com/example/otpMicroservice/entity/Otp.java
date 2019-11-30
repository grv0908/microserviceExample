package com.example.otpMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Gaurav Rajput
 * Created on 29/11/19
 */
@Entity
public class Otp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int otp;
    private int validTimeStamp;

    Otp() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOtp() {
        return otp;
    }

    public int getValidTimeStamp() {
        return validTimeStamp;
    }

    public void setValidTimeStamp(int validTimeStamp) {
        this.validTimeStamp = validTimeStamp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
}
