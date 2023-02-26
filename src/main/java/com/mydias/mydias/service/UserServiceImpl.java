package com.mydias.mydias.service;

import com.mydias.mydias.controller.UserController;
import com.mydias.mydias.repository.UserDao;
import com.mydias.mydias.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserDao userDao;

    @Override
    public void register(UserVO user){
        BCryptPasswordEncoder scPwd = new BCryptPasswordEncoder();
        String encPwd = scPwd.encode(user.getPasswdEnc());
        user.setPasswdEnc(encPwd);
        userDao.register(user);
    }

    @Override
    public UserVO login(UserVO user){
        return userDao.login(user);
    }

    @Override
    public UserVO selectUser(String email){
        return userDao.selectUser(email);
    }

    @Override
    public int emailChk(UserVO user){
        int result = userDao.emailChk(user);
        return result;
    }
}