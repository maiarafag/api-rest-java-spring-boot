package com.spring.spring.boot.mf.controle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusControle {


    @GetMapping(path = "/api/status")

    public String check() {

        return "online";
    }
}
