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

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "product_group_id")
    private ProductGroup group;
}
