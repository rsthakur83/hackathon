package com.hcling.gr.hackathon.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcling.gr.hackathon.service.CustomerProductService;


@RestController
public class CustomerProductController {

    @Autowired
    private CustomerProductService cpService;

    /**
     * Gets data.
     *
     * @return the data
     */
    @GetMapping("/customers/{customerId}/products")

    public ResponseEntity<List<CustomerProductData>> getData(@PathVariable Long customerId) {
        ResponseEntity<List<CustomerProductData>> response;
        List<CustomerProductData> productList = cpService.getCustomerProducts(customerId);
        if(productList.isEmpty()) {
            response = new ResponseEntity(productList, HttpStatus.OK);
        } else {
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return response;

    }
}
