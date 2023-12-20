package com.devwook.lucisapiserver.controller;


import com.devwook.lucisapiserver.data.dto.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lucis/")
//LSMS (Lucis System Monitoring Service)
public class LSMSController {

    private LSMSService LSMSservice;

    public LSMSController(LSMSService LSMSservice) {
        this.LSMSservice = LSMSservice;
    }

    @GetMapping(value = "/client-data/{dataId}")
    public LSMSDto getData(@PathVariable String dataId) {
        return LSMSservice.getData(dataId);
    }

    @PostMapping(value = "/clinet-data")
    public LSMSDto createData(@RequestBody LSMSDto LSMSdto) {

    }
}
