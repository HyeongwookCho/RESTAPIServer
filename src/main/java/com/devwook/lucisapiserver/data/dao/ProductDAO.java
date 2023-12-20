package com.devwook.lucisapiserver.data.dao;

import com.devwook.lucisapiserver.data.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
