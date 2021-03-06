package com.khela.service;

import com.khela.domain.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);
    Product editProduct(Product product);
    void deleteProduct(Long productId);
    Product getProductDetails(Long productId);
    List<Product> getAllProducts();
}
