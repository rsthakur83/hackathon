package com.hcling.gr.hackathon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcling.gr.hackathon.model.CustomerProductResponse;
import com.hcling.gr.hackathon.service.CustomerProductService;


/**
 * The type Customer product controller.
 */
@RestController
public class CustomerProductController {

    @Autowired
    private CustomerProductService cpService;

    /**
     * Gets data.
     *
     * @param customerId the customer id
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
