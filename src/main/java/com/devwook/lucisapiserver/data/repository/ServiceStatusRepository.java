package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.ServiceStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceStatusRepository extends JpaRepository<ServiceStatusEntity, Long> {
}
