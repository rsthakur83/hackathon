package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {
}