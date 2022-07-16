package com.example.hellospring.service;

import com.example.hellospring.entity.Member;

import java.util.List;

public interface MemberService {

    public void saveMember(Member member);
    public List<Member> getAllMember();

}
