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
	/**
	 * Instantiates a new Product group.
	 */
	public ProductGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new Product group.
	 *
	 * @param id       the id
	 * @param name     the name
	 * @param products the products
	 */
	public ProductGroup(Long id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.products = products;
	}

	@Id
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @OneToMany(mappedBy = "group")
    private List<Product> products;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductGroup other = (ProductGroup) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
}
