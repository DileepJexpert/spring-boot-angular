package com.spring.angular;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.ws.Response;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
 
    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
       // HttpEntity<Response> response = new HttpEntity<T>();
        return model;
    }
}