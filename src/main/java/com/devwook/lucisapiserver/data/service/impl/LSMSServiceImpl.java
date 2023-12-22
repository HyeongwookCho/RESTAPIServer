package com.devwook.lucisapiserver.data.service.impl;

import com.devwook.lucisapiserver.data.dto.LSMSDTO;
import com.devwook.lucisapiserver.data.entity.DriveInfoEntity;
import com.devwook.lucisapiserver.data.entity.ProcessStatusEntity;
import com.devwook.lucisapiserver.data.entity.ServiceStatusEntity;
import com.devwook.lucisapiserver.data.entity.SystemResourceEntity;
import com.devwook.lucisapiserver.data.repository.ProcessStatusRepository;
import com.devwook.lucisapiserver.data.repository.ServiceStatusRepository;
import com.devwook.lucisapiserver.data.repository.SystemResourceRepository;
import com.devwook.lucisapiserver.data.repository.DriveInfoRepository;
import com.devwook.lucisapiserver.data.service.LSMSService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LSMSServiceImpl implements LSMSService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SystemResourceRepository systemResourceRepository;
    @Autowired
    private ProcessStatusRepository processStatusRepository;
    @Autowired
    private ServiceStatusRepository serviceStatusRepository;
    @Autowired
    private DriveInfoRepository driveInfoRepository;
    public void saveLSMSDTO(LSMSDTO dto) {
        SystemResourceEntity systemResourceEntity = modelMapper.map(dto.getSystemResource(), SystemResourceEntity.class);
        systemResourceEntity = systemResourceRepository.save(systemResourceEntity);

        for (LSMSDTO.SystemResource.DriveInfo driveInfo : dto.getSystemResource().getDriveInfo()) {
            DriveInfoEntity driveInfoEntity = modelMapper.map(driveInfo, DriveInfoEntity.class);
            driveInfoEntity.setSystemResourceEntity(systemResourceEntity);
            driveInfoRepository.save(driveInfoEntity);
        }

        for (LSMSDTO.ProcessStatus processStatus : dto.getProcessStatus()) {
            ProcessStatusEntity processStatusEntity = modelMapper.map(processStatus, ProcessStatusEntity.class);
            processStatusEntity.setSystemResourceEntity(systemResourceEntity);
            processStatusRepository.save(processStatusEntity);
        }

        for (LSMSDTO.ServiceStatus serviceStatus : dto.getServiceStatus()) {
            ServiceStatusEntity serviceStatusEntity = modelMapper.map(serviceStatus, ServiceStatusEntity.class);
            serviceStatusEntity.setSystemResourceEntity(systemResourceEntity);
            serviceStatusRepository.save(serviceStatusEntity);
        }
    }

}

