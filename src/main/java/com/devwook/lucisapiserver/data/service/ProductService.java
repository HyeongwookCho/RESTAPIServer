package com.devwook.lucisapiserver.data.service;

import com.devwook.lucisapiserver.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);

}
