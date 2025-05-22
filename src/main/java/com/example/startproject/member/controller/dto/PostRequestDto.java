package com.example.startproject.member.controller.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
// 파라미터가 없는 디폴트 생성자를 자동으로 생성함.

// 클래스에 명시적으로 선언된 생성자가 없더라도 인스턴스 생성 가능 -> All은 모든 필드값을 파라미터로 받는 생성자를 자동으로 생성함
public class PostRequestDto {
    private String id;
    private String name;
    @JsonProperty("phoneNumber") // 변수를 매핑 phoneNumber로 받은 값을 email에 저장
    private String email;
}
