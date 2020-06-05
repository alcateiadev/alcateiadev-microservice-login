package com.br.alcateiadev.microservicelogin.microservicelogin.gateway.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status")
public class StatusResource {

    @GetMapping
    @ResponseBody
    public String status(){
        return "OK";
    }

}
