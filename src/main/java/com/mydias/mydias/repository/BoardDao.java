package com.mydias.mydias.repository;

import com.mydias.mydias.model.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    List<Board> selectList();

    String makeArticleNumber();

    void insertArticle(Board board);

}
