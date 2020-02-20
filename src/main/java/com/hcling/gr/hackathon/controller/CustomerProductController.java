package com.hcling.gr.hackathon.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcling.gr.hackathon.model.CustomerProductResponse;
import com.hcling.gr.hackathon.model.Product;
import com.hcling.gr.hackathon.model.Response;
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

    public ResponseEntity<CustomerProductResponse> getData(@PathVariable Long customerId) {
        ResponseEntity<CustomerProductResponse> response;
        CustomerProductResponse productResponse = cpService.getCustomerProducts(customerId);
        if(productResponse.getProductGroup().isEmpty()) {
        	  response = new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
        	response = new ResponseEntity(productResponse, HttpStatus.OK);
        }
        return response;

    }
}
