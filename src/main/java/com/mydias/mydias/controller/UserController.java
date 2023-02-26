package com.mydias.mydias.controller;

import com.mydias.mydias.service.UserService;
import com.mydias.mydias.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequiredArgsConstructor
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    // 회원가입 페이지 이동
    @GetMapping("/user/register")
    public String getRegister() {
        logger.info("회원가입 페이지 진입");
        return "user/register";
    }
    
    // 회원가입
    @PostMapping("/user/register")
    public String register(UserVO user) throws Exception{
        int result = userService.emailChk(user);

        if (result == 1) {
            logger.info("XXX 아이디 중복 XXX");
            return "user/register";
        } else {
            boolean check = false;
            /* 최소 8 자, 최소 하나의 문자, 하나의 숫자 및 하나의 특수 문자 */
            String pw_chk = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$";

            Pattern pattern_symbol = Pattern.compile(pw_chk);
            Matcher matcher_symbol = pattern_symbol.matcher(user.getPasswdEnc());

            if(matcher_symbol.find()) {
                check = true;
            }

            if (check) {
                // 회원가입 서비스 실행
                userService.register(user);
                logger.info("!!! 회원가입 성공 !!!");
                return "user/register";
            } else {
                logger.info("XXX 비밀번호 유효하지 않음 XXX");
                return "user/register";
            }
        }
    }

    @RequestMapping("/user/emailChk")
    public int emailChk(UserVO user) {
        int result = userService.emailChk(user);
        return result;
    }
}
