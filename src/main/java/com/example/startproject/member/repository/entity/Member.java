package com.example.startproject.member.repository.entity;


import jakarta.persistence.*;
import lombok.*;

// 안쪽의 필드값을 기반으로 콜럼을 만들어줌

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE )
@Builder
@Getter
public class Member {

    // 자동으로 번호를 매겨줌

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long index;

    private String id;

    private String name;

    // 이것도 h2에서 보면 phone_number이런식으로 됨
    private String phoneNumber;
}
