package com.hcling.gr.hackathon.service;

import com.hcling.gr.hackathon.model.CustomerProductResponse;
import com.hcling.gr.hackathon.model.Product;
import com.hcling.gr.hackathon.model.ProductGroup;
import com.hcling.gr.hackathon.model.ProductGroupResponse;
import com.hcling.gr.hackathon.repository.CustomerProductRepository;
import com.hcling.gr.hackathon.repository.ProductGroupRepository;
import com.hcling.gr.hackathon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Customer product service.
 */
@Service
public class CustomerProductService {

    @Autowired
    private CustomerProductRepository cpRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductGroupRepository pgRepository;

    /**
     * Gets customer products.
     *
     * @param customerId the customer id
     * @return the customer products
     */
    public CustomerProductResponse getCustomerProducts(Long customerId) {
        List<Long> cpIdList = cpRepository.getCustomerProductIds(customerId);
        final List<Product> products = new ArrayList<>();
        cpIdList.stream().forEach(productId -> {
            products.addAll(productRepository.getProducts(productId));
        });

        Map<ProductGroup, List<Product>> responseMap = new HashMap<>();
        products.stream().forEach(product -> {
            ProductGroup key = product.getGroup();
            if(responseMap.keySet().contains(key)) {
                responseMap.get(key).add(product);
            } else {
                List<Product> productList = new ArrayList<>();
                productList.add(product);
                responseMap.put(key, productList);
            }
        });

        List<ProductGroupResponse> productGroupResponses = new ArrayList<>();
        responseMap.keySet().stream().forEach(pg-> {
        	ProductGroupResponse productGroupResponse = new ProductGroupResponse();
            productGroupResponse.setName(pg.getName());
            productGroupResponse.setId(pg.getId());
        	List<Product> productList = new ArrayList<>();
        	responseMap.get(pg).stream().forEach(product -> {
        		Product p = new Product();
        		p.setId(product.getId());
        		p.setName(product.getName());
                productList.add(p);
        	});
            productGroupResponse.setProducts(productList);
            productGroupResponses.add(productGroupResponse);
        });
        CustomerProductResponse response = new CustomerProductResponse();
        response.setProductGroup(productGroupResponses);
        return response;
    }
}
