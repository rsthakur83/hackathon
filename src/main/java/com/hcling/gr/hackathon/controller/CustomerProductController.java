package com.hcling.gr.hackathon.controller;

import com.hcling.gr.hackathon.model.CustomerProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerProductController {

    @Autowired
    private CustomerProduct cpService;

    @GetMapping("/customers/{customerId}/products")
    public ResponseEntity getData() {
        return null;
    }
}
