package com.hcling.gr.hackathon.model;

import lombok.Data;

import javax.persistence.*;

/**
 * The type Product.
 */
@Data
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "product_group_id")
    private ProductGroup group;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductGroup getGroup() {
		return group;
	}

	public void setGroup(ProductGroup group) {
		this.group = group;
	}
    
    
}
