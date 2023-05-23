package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    @GetMapping("")
    public String defaultString() {
        return "default string";
    }

    @GetMapping("/special")
    public String specialString() {
        return "special string";
    }
}
