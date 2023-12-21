package com.devwook.lucisapiserver.data.service.impl;

import com.devwook.lucisapiserver.data.dao.LSMSDAO;
import com.devwook.lucisapiserver.data.dto.LSMSDTO;
import com.devwook.lucisapiserver.data.entity.SystemResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class LSMSServiceImpl {

    LSMSDAO lsmsdao;

    @Autowired
    public LSMSServiceImpl(LSMSDAO lsmsdao) {
        this.lsmsdao = lsmsdao;
    }

    @Override
    public SystemResourceEntity saveSystemResource(String serverName, List<LSMSDTO.SystemResource.DriveInfo> driveInfo, String CPUInfo, String memoryInfo, LocalDateTime collectStartTime){
        SystemResourceEntity systemResourceEntity = new SystemResourceEntity(serverName, driveInfo, CPUInfo, memoryInfo, collectStartTime);

        return LSMSDAO.saveSystemResource(systemResourceEntity);
    }
}
