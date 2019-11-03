package com.farm.smart.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthResource {

    @RequestMapping("/login")
    public String login() {

        return "login";
    }
}
