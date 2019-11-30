package com.example.catalogMicroservice.controller;

import com.example.catalogMicroservice.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gaurav Rajput
 * Created on 29/11/19
 */
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @GetMapping("/private/getProducts")
    public List<String> getProducts() {
        ArrayList<String> al = new ArrayList<>();
        al.add("Madhu k kapde");
        al.add("Madhu ki slavar");
        System.out.println("Return product list");
        System.out.println(al);
        return al;
    }
}
