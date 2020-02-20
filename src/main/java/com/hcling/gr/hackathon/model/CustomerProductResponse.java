package com.hcling.gr.hackathon.model;

import java.util.List;

import lombok.Data;

/**
 * The type Customer product.
 */

@Data
public class CustomerProductResponse {
    private List<ProductGroups> productGroup ;

	public List<ProductGroups> getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(List<ProductGroups> productGroup) {
		this.productGroup = productGroup;
	}
    
}
