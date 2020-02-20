package com.hcling.gr.hackathon.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The type Customer product.
 */
@Data
@Entity
@Table(name = "user_product")
public class CustomerProduct {
	@Id
	private Long id;
	@Column(name="UserID")
	private Long customerId;
	@Column(name="pd_id")
	private Long productId;
}
