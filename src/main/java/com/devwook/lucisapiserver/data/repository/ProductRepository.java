package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
