package com.example.tastyplatters.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class HomeController {
        @RequestMapping("/test")
        public String home(){
            return "index";
        }
    }
