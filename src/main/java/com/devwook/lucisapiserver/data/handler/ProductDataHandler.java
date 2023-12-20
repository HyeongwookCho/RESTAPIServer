package com.devwook.lucisapiserver.data.handler;

import com.devwook.lucisapiserver.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
