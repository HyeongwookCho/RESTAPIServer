package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.ProcessStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessRepository extends JpaRepository<ProcessStatusEntity, Long> {
}
