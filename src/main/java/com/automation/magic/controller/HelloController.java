package com.automation.magic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value= "/getSome")
    public ResponseEntity<Object> getSome() {
        return ResponseEntity.ok().body("lumos.");
    }

}
