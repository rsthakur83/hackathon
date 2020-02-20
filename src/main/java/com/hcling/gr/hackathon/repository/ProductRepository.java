package com.hcling.gr.hackathon.repository;

import com.hcling.gr.hackathon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("select p from Product p where p.id = :productId")
    List<Product> getProducts(@Param("productId") Long productId);
}
