package com.devwook.lucisapiserver.data.repository;

import com.devwook.lucisapiserver.data.entity.DriveInfoEntity;
import com.devwook.lucisapiserver.data.entity.SystemResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveInfoRepository extends JpaRepository<DriveInfoEntity, Long> {
    // 필요한 쿼리 메서드 작성
}
