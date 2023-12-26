package com.devwook.lucisapiserver.controller;

import com.devwook.lucisapiserver.data.dto.LSMSDTO;
import com.devwook.lucisapiserver.data.service.LSMSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lsms")
public class LSMSController {
    private static final Logger logger = LoggerFactory.getLogger(LSMSController.class);

    private final LSMSService lsmsService;

    @Autowired
    public LSMSController(LSMSService lsmsService) {
        this.lsmsService = lsmsService;
    }

    @PostMapping("/result")
    public ResponseEntity<Void> saveLSMSDTO(@RequestBody LSMSDTO dto) {
        logger.debug("Received LSMSDTO: {}", dto);
        lsmsService.saveLSMSDTO(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
