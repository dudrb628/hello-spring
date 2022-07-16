package com.example.hellospring.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
