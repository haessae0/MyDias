package com.mydias.mydias.controller;

import com.mydias.mydias.model.Board;
import com.mydias.mydias.repository.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardDao boardDao;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("board/articleInsert");
        List<Board> list = boardDao.selectList();

        System.out.println(list);
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/insert")
    public void articleInsert(Model model, Board board) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        board.setATC_NO(boardDao.makeArticleNumber());
        board.setINST_ID("mpark");

        boardDao.insertArticle(board);
    }
}
