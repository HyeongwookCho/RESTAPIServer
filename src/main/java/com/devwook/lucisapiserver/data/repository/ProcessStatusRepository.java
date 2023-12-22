package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.ProcessStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessStatusRepository extends JpaRepository<ProcessStatusEntity, Long> {
}
