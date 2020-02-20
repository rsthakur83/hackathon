package com.hcling.gr.hackathon.model;

import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_group_id")
    private ProductGroup group;
}
