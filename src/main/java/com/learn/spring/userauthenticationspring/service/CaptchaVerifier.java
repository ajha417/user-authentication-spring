package com.learn.spring.userauthenticationspring.service;

public interface CaptchaVerifier {
    boolean verifyCaptcha(String captcha);
}
