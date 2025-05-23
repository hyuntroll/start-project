package com.example.startproject.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/new-thing")
    public String test() {
        return "index.html";
    }

    @GetMapping("new/login")
    public String loginPage() {
        return "redirect:/login-form.html";
    }
    @PostMapping("new/login")
    public String loginProcess(
            @RequestParam String id,
            @RequestParam String password,
            Model model
    ) {
        if ( id.equals(password) ) {
            model.addAttribute("loginId", id);
        }

        return "login-result";
    }

}
