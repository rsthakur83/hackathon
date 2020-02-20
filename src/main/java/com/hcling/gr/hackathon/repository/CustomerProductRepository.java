package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.CustomerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Long> {
    @Query("select cp.productId from CustomerProduct cp where cp.customerId = :customerId")
    List<Long> getCustomerProductIds(@Param("customerId") Long customerId);
}
