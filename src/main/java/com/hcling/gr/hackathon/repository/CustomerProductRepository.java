package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.CustomerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Long> {
}
