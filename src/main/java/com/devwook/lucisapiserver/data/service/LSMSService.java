package com.devwook.lucisapiserver.data.service;

import com.devwook.lucisapiserver.data.dto.LSMSDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface LSMSService {

    LSMSDTO saveSystemResource(String serverName, List<LSMSDTO.SystemResource.DriveInfo> driveInfo, String CPUInfo, String memoryInfo, LocalDateTime collectStartTime);

    LSMSDTO saveProcessStatus(String name, String status);
    LSMSDTO saveServiceStatus(String name, String status);

    LSMSDTO getData(String id);
}
