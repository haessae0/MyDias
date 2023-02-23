package com.mydias.mydias.controller;

import com.mydias.mydias.model.User;
import com.mydias.mydias.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/index")
    public List<User> index() {
        List<User> list = userDao.selectList();
        return list;
    }
}
