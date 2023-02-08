package com.mydias.mydias.service;

import com.mydias.mydias.model.User;
import com.mydias.mydias.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }
}