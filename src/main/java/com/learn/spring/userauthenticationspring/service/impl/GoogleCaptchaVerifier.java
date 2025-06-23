package com.learn.spring.userauthenticationspring.service.impl;

import com.learn.spring.userauthenticationspring.service.CaptchaVerifier;

public class GoogleCaptchaVerifier implements CaptchaVerifier {
    @Override
    public boolean verifyCaptcha(String captcha) {
        return true;
    }
}
