package com.example.mainMicroservice.controllers;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gaurav Rajput
 * Created on 29/11/19
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/getOtp")
    public int getOtp() {
        System.out.println("Calling Otp Microservice");

        final String urlOtp = "http://localhost:8082/private/otp/generate";
        // Code to call Otp service
        RestTemplate restTemplate = new RestTemplate();
        int result = restTemplate.getForObject(urlOtp, Integer.class);

        return result;
    }

    @GetMapping("/getProducts/{otp}")
    public List<String> getProducts(@PathVariable(value="otp") int otp) {
        if(otp != 1231) {
            return new ArrayList<>();
        }
        final String urlProducts = "http://localhost:8083/catalog/private/getProducts";
        // Code to call Otp service
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<String>> rateResponse =
                restTemplate.exchange(urlProducts,
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<String>>() {
                        });

        List<String> products = rateResponse.getBody();

        return products;
    }
}
