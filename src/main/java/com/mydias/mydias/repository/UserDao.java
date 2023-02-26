package com.mydias.mydias.repository;

import com.mydias.mydias.vo.UserVO;

public interface UserDao {

    // 회원가입
    public void register(UserVO user);

    // 로그인
    public UserVO login(UserVO user);

    UserVO selectUser(String email);

    public int emailChk(UserVO user);
}
