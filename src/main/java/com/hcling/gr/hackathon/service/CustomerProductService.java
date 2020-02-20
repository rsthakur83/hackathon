package com.hcling.gr.hackathon.service;

import com.hcling.gr.hackathon.model.CustomerProduct;
import com.hcling.gr.hackathon.model.Product;
import com.hcling.gr.hackathon.repository.CustomerProductRepository;
import com.hcling.gr.hackathon.repository.ProductGroupRepository;
import com.hcling.gr.hackathon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerProductService {

    @Autowired
    private CustomerProductRepository cpRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductGroupRepository pgRepository;

    public List<CustomerProduct> getCustomerProducts(Long customerId) {
        List<Long> cpIdList = cpRepository.getCustomerProductIds(customerId);
        final List<Product> products = new ArrayList<>();
        cpIdList.stream().forEach(productId -> {
            products.addAll(productRepository.getProducts(productId));
        });
        return null;
    }

}
