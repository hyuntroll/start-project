package com.example.startproject.member.controller.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.converter.json.GsonBuilderUtils;

@Getter
@Setter
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
