package com.devwook.lucisapiserver.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    @DeleteMapping(value ="/delete/{variable}")
    public String DeleteVariable(@PathVariable("variable") String var) {
        return var;
        // 원래는 variable을 통해 받은 값을 쿼리문으로 조회하고
        // 해당 데이터를 delete 한 후 처리가 정상적으로 되었는지, 안되었는지 status 값을 보내주는 절차를 진행해야하지만
        // 간단한 예시이기에 생략한다.
    }
}
