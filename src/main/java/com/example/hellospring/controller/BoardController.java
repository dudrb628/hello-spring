package com.example.hellospring.controller;

import com.example.hellospring.entity.Board;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    @GetMapping(value = "/api/boardList")
    @ResponseBody
    public List<Board> boardList(){
        List<Board> boardList = new ArrayList<>();
        return boardList;
    }
}
