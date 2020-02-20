package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Product group repository.
 */
@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
}
