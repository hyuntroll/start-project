package com.example.startproject.member.service;


import com.example.startproject.member.repository.MemberRepository;
import com.example.startproject.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServicempl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();

        memberRepository.save(member);
        return "success";
    }
}
