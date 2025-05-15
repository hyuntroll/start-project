package com.example.startproject.member.controller;


import com.example.startproject.member.controller.dto.JoinRequest;
import com.example.startproject.member.repository.MemberRepository;
import com.example.startproject.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    // 컨트롤러를 통해 요청을 받고 String으로 리턴

    @GetMapping("/hello")
    public String getHello() {
         return "hello world!!";
    }

    // 어떤 값을 받은 것인가: entity
    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest) {
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();

        String result = memberService.join(id, name, phoneNumber);
        if (result.equalsIgnoreCase("success")) {
            return "success";
        }
        else {
            return "fail";
        }
    }

//    @GetMapping
//    @PutMapping
//    @PostMapping
//    @DeleteMapping
}
