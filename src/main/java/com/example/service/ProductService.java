package com.example.service;

import com.example.domain.Product;

import java.util.List;
import java.util.Properties;

public interface ProductService {
    Product addProduct(Product product);
    Product editProduct(Product product);
    void deleteProduct(Long productId);
    Product getProductDetails(Long productId);
    List<Product> getAllProducts();
}
