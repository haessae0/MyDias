package com.mydias.mydias.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mydias")
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
