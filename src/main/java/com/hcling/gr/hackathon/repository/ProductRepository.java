package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Product repository.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    /**
     * Gets products.
     *
     * @param productId the product id
     * @return the products
     */
    @Query("select p from Product p where p.id = :productId")
    List<Product> getProducts(@Param("productId") Long productId);
}
