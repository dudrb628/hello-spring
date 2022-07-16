package com.example.hellospring.service;

import com.example.hellospring.entity.Board;
import com.example.hellospring.entity.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired // 1
    private BoardRepository boardRepository;

    @Override
    public void createBoard(Board Board) {
        boardRepository.save(Board); // 2
    }

    @Override
    public Board getById(Long id) {
        return boardRepository.getById(id);
    }


    @Override
    public void deleteBoard(Long id) {
        boardRepository.delete(boardRepository.getById(id)); // 3
    }

    @Override
    public List<Board> getAllBoards() {
        return boardRepository.findAll(); // 4
    }

}
