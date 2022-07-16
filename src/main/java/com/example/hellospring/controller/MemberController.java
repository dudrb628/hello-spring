package com.example.hellospring.controller;

import com.example.hellospring.entity.Member;
import com.example.hellospring.entity.MemberRepository;
import com.example.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping(value = "/api/saveMember")
    @ResponseBody
    public String saveMember(@RequestBody Member member) {
        //Member member = new Member(memberMap.get("memberId").toString(),memberMap.get("password").toString());
        memberService.saveMember(member);
        return member.toString();
    }

    @ResponseBody
    @GetMapping(value = "/api/findAllMember")
    public List<Member> findAllMember(){
        return memberService.getAllMember();
    }
}
