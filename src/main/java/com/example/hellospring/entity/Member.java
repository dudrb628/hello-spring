package com.example.hellospring.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String memberId; // 제목

    private String password; // 내용

    @Builder
    public Member(String memberId, String password){
        this.memberId = memberId;
        this.password = password;
    }
}
