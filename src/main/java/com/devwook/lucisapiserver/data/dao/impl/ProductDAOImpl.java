package com.devwook.lucisapiserver.data.dao.impl;

import com.devwook.lucisapiserver.data.dao.ProductDAO;
import com.devwook.lucisapiserver.data.entity.ProductEntity;
import com.devwook.lucisapiserver.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        return productRepository.getOne(productId);
    }
}
