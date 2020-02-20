package com.hcling.gr.hackathon.model;

import java.util.List;

/**
 * The type Product groups.
 */
public class ProductGroupResponse {
   
	private Long id;
	private String name;
	private List<Product> products;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
		this.id = id;
	}

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
		return name;
	}

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
		this.name = name;
	}

    /**
     * Gets products.
     *
     * @return the products
     */
    public List<Product> getProducts() {
		return products;
	}

    /**
     * Sets products.
     *
     * @param products the products
     */
    public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
