package com.mydias.mydias.service;

import com.mydias.mydias.model.Board;

import java.util.List;

public interface BoardService {

    List<Board> selectList();

    String makeArticleNumber();

    void insertArticle(Board board);
}
