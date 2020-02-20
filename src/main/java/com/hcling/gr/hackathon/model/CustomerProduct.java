package com.hcling.gr.hackathon.model;

import lombok.Data;

/**
 * The type Customer product.
 */
@Data
public class CustomerProduct {
    private Long id;
    private Long customerId;
    private Long productId;
}
