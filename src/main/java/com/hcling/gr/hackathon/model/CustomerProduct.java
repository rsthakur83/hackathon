package com.hcling.gr.hackathon.model;

import lombok.Data;

@Data
public class CustomerProduct {
    private Long id;
    private Long customerId;
    private Long productId;
}
