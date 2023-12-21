package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.SystemResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemResourceRepository extends JpaRepository<SystemResourceEntity, Long> {
    // 필요한 쿼리 메서드 작성
}
