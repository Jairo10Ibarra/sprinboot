package com.fundamentosspring.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    @ResponseBody
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("HELLO FROM CONTROLLER NUEVO CAMBIOSSSS" , HttpStatus.OK);
    }

}
