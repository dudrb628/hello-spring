package com.example.hellospring.service;

import com.example.hellospring.entity.Board;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.List;

public interface BoardService {

    public Board getById(Long id);

    public void createBoard(Board board);
    public void deleteBoard(Long id);
    public List<Board> getAllBoards();


}
