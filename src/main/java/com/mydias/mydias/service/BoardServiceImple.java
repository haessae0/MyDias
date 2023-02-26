package com.mydias.mydias.service;

import com.mydias.mydias.model.Board;
import com.mydias.mydias.repository.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoardServiceImple implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Override
    public List<Board> selectList() {
        return boardDao.selectList();
    }

    @Override
    public String makeArticleNumber() {
        return boardDao.makeArticleNumber();
    }

    @Override
    public void insertArticle(Board board) {
        boardDao.insertArticle(board);
    }
}