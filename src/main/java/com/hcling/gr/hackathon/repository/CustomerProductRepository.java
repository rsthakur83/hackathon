package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.CustomerProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Customer product repository.
 */
@Repository
public interface CustomerProductRepository extends JpaRepository<CustomerProduct, Long> {
    /**
     * Gets customer product ids.
     *
     * @param customerId the customer id
     * @return the customer product ids
     */
    @Query("select cp.productId from CustomerProduct cp where cp.customerId = :customerId")
    List<Long> getCustomerProductIds(@Param("customerId") Long customerId);
}
