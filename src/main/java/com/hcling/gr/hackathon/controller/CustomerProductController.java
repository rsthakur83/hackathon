package com.hcling.gr.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcling.gr.hackathon.model.ProductGroups;
import com.hcling.gr.hackathon.service.CustomerProductService;

@RestController
public class CustomerProductController {

    @Autowired
    private CustomerProductService cpService;

    @GetMapping("/customers/{customerId}/products")
    public ProductGroups getData() {
        return new ProductGroups();
    }
}
