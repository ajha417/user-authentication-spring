package com.learn.spring.userauthenticationspring.controller;

import com.learn.spring.userauthenticationspring.dto.SignUpDto;
import com.learn.spring.userauthenticationspring.enums.ECaptchaVerifier;
import com.learn.spring.userauthenticationspring.service.CaptchaVerifier;
import com.learn.spring.userauthenticationspring.utils.CaptchaVerifierFactory;
import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

@Resource
public class SignUpController {

    public ResponseEntity<?> signUp(@RequestBody SignUpDto signUpDto){
        if (StringUtils.isEmpty(signUpDto.getToken()) || StringUtils.isEmpty(signUpDto.getName()) || StringUtils.isEmpty(signUpDto.getUsername()) || StringUtils.isEmpty(signUpDto.getPassword())) {
            return ResponseEntity.badRequest().body("Invalid SignUpDto");
        }
        CaptchaVerifier captchaVerifier = CaptchaVerifierFactory.getCaptchaVerifier(ECaptchaVerifier.GOOGLE_RECAPTCHA_VER.ordinal());
        if (captchaVerifier != null && !captchaVerifier.verifyCaptcha(signUpDto.getToken())){
            return ResponseEntity.badRequest().body("Invalid captcha");
        }
        return null;
    }
}
