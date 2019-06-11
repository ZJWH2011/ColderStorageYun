package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/visitor")
public class VisitController {
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }
}
