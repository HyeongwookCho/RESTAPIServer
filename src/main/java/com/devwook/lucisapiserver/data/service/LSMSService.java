package com.devwook.lucisapiserver.data.service;

import com.devwook.lucisapiserver.data.dto.LSMSDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface LSMSService {
    void saveLSMSDTO(LSMSDTO dto);
}
