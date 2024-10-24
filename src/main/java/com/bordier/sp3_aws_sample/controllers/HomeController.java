package com.bordier.sp3_aws_sample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(Collections.singletonMap("api", "prueba"));
    }
}
