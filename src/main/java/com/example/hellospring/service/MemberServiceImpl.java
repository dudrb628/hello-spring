package com.example.hellospring.service;


import com.example.hellospring.entity.Member;
import com.example.hellospring.entity.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void saveMember(Member member){
        memberRepository.save(member);
    }

    public List<Member> getAllMember(){
        return memberRepository.findAll();
    }

}
