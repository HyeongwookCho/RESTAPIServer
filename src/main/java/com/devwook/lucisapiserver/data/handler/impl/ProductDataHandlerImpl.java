package com.devwook.lucisapiserver.data.handler.impl;

import com.devwook.lucisapiserver.data.dao.ProductDAO;
import com.devwook.lucisapiserver.data.entity.ProductEntity;
import com.devwook.lucisapiserver.data.handler.ProductDataHandler;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {

    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock){
        ProductEntity productEntity = new ProductEntity(productId, productName, productPrice, productStock);

        return productDAO.saveProduct(productEntity);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}
