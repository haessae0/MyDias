package com.mydias.mydias.service;

import com.mydias.mydias.vo.UserVO;

public interface UserService {
   // 회원가입
   public void register(UserVO user);

   // 로그인
   UserVO login(UserVO user);

   UserVO selectUser(String email);

   public int emailChk(UserVO user);
}
