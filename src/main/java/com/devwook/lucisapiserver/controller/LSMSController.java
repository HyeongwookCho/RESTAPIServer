package com.devwook.lucisapiserver.controller;


import com.devwook.lucisapiserver.data.dto.LSMSDTO;
import com.devwook.lucisapiserver.data.dto.ProductDto;
import com.devwook.lucisapiserver.data.service.LSMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lucis/")
//LSMS (Lucis System Monitoring Service)
public class LSMSController {

    private LSMSService lsmsService;

    @Autowired
    public LSMSController(LSMSService lsmsService) {
        this.lsmsService = lsmsService;
    }

    @GetMapping(value = "/client-data/{dataId}")
    public LSMSDTO getData(@PathVariable String dataId) {
        return lsmsService.getData(dataId);
    }

    @PostMapping(value = "/clinet-data")
    public LSMSDTO createData(@RequestBody LSMSDTO lsmsDto) {
        return lsmsDto;
    }
}
