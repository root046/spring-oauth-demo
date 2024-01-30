package com.bader88.oauthdemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oath2Controller {
    @GetMapping("/")
    public Authentication helloOauth2(Authentication authentication) {
        return authentication;
    }
}
