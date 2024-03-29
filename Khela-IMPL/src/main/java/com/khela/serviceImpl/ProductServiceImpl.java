package com.khela.serviceImpl;

import com.khela.domain.Product;
import com.khela.entity.ProductEntity;
import com.khela.mapper.ProductMapper;
import com.khela.repository.ProductRepository;
import com.khela.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public Product addProduct(Product product) {
        ProductEntity productEntity = productRepository.save(productMapper.domainToEntity().map(product));
        return productMapper.entityToDomain().map(productEntity);
    }

    @Override
    public Product editProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public Product getProductDetails(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productMapper.listEntityToListDomain(productRepository.findAll());
    }
}
