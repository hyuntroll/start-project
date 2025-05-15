package com.example.startproject.member.repository;
import com.example.startproject.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// <T, type>entity의 객체와 타입
public interface MemberRepository extends JpaRepository<Member, Long> {
}