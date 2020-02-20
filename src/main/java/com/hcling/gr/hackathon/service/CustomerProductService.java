package com.hcling.gr.hackathon.service;

import com.hcling.gr.hackathon.repository.CustomerProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerProductService {

    @Autowired
    private CustomerProductRepository cpRepository;


}
