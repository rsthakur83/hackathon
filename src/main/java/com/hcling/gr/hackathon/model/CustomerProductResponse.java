package com.hcling.gr.hackathon.model;

import java.util.List;

import lombok.Data;

/**
 * The type Customer product.
 */
@Data
public class CustomerProductResponse {
    private List<ProductGroupResponse> productGroup ;

    /**
     * Gets product group.
     *
     * @return the product group
     */
    public List<ProductGroupResponse> getProductGroup() {
		return productGroup;
	}

    /**
     * Sets product group.
     *
     * @param productGroup the product group
     */
    public void setProductGroup(List<ProductGroupResponse> productGroup) {
		this.productGroup = productGroup;
	}
    
}
