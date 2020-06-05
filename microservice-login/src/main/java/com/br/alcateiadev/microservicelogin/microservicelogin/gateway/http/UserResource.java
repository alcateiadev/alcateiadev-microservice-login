package com.br.alcateiadev.microservicelogin.microservicelogin.gateway.http;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/user")
public class UserResource {

    @GetMapping
    @ResponseBody
    public Map<String, String> token(HttpSession session) {
        Map<String, String> map = new HashMap<>();
        map.put("token", session.getId());
        map.put("name", SecurityContextHolder.getContext().getAuthentication().getName());

        return map;
    }

}
