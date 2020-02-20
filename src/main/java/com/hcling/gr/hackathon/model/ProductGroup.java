package com.hcling.gr.hackathon.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * The type Product group.
 */
@Data
@Entity
@Table(name = "PRODUCT_GROUP")
public class ProductGroup {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Product> products;
}
