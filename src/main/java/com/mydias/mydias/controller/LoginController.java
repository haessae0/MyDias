package com.mydias.mydias.controller;

import com.mydias.mydias.service.UserService;
import com.mydias.mydias.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    // 로그인
    @RequestMapping("/user")
    public String userLogin(String email, String passwdEnc){
        UserVO loginUser = userService.selectUser(email);
        if (loginUser != null) {
            BCryptPasswordEncoder scPwd = new BCryptPasswordEncoder();
            if(scPwd.matches(passwdEnc, loginUser.getPasswdEnc())){
                return "user/main";
            }
            else {
                return "redirect:/";
            }
        }
        return "redirect:/";
    }
}
