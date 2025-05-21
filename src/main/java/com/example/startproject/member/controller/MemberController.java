package com.example.startproject.member.controller;


import com.example.startproject.member.controller.dto.JoinRequest;
import com.example.startproject.member.controller.dto.NewRequestDto;
import com.example.startproject.member.repository.MemberRepository;
import com.example.startproject.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping(path = "/nice")
    public String nice() {
        return "get NewS";
    }

    //PathVariable 주소를 지정하면서 특정 부분이 유동적으로 변경할 수 있게 하는 것
    // 매개변수에 @PathVariable 어노테이션을 붙여 사용 (주소에서 바뀔 부분과 매개변수 이름을 동일시)
    @GetMapping("path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        return name;
    }
    // Query Parameter
    // 검색할 때의 여러가지 매개변수 인자 &key=value, &key=value
    // Map을 사용하는 경우
    @GetMapping("/path-value")
    public String queryParam(@RequestParam Map<String, String> queryParams) {
        StringBuilder sb = new StringBuilder();

        queryParams.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
        });
        return sb.toString();
    }

    // key 값을 지정해줄 경우 / @RquestParam 어노테이션을 각 매개변수에 붙여줌
    // 현재 이 경우에는 /newPath?name=안녕하세요?phone=나는 이런식으로
    @GetMapping("/newPath")
    public String newPath(@RequestParam String name, @RequestParam String phone) {
        System.out.println(name);
        System.out.println(phone);
        return name + ", " + phone;
    }
    // dto 형태로 매핑하는 방법 / XXRequestDto 파일 생성
    // 필드와 get, set 메서드 생성
    // 매개변수로 XXRequestDto를 받아옴 ( 어노테이션은 붙이지 않음 )
    @GetMapping("/request-dto")
    public String requestDto(NewRequestDto newRequest) {
//        System.out.println(newRequest.getName());
//        System.out.println(newRequest.getPhone());
        return newRequest.toString();
    }


//    @GetMapping
//    @PutMapping
//    @PostMapping
//    @DeleteMapping
}
