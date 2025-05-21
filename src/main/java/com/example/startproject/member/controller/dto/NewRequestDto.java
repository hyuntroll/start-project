package com.example.startproject.member.controller.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.converter.json.GsonBuilderUtils;

@Getter
@NoArgsConstructor
public class NewRequestDto {

    private String name;
    private String phone;

    public String toString() {
        return "UserRequest{" +
                "name=" + name + '\'' +
                ", num=" + phone +
                '}';
    }
}
