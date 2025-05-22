package com.example.startproject.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/newThing")
    public String test() {
        return "redirect:/index.html";
    }

}
