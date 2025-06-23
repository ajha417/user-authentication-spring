package com.learn.spring.userauthenticationspring.utils;

import com.learn.spring.userauthenticationspring.service.CaptchaVerifier;
import com.learn.spring.userauthenticationspring.service.impl.GoogleCaptchaVerifier;

public class CaptchaVerifierFactory {

    public static CaptchaVerifier getCaptchaVerifier(int captchaType){
        switch (captchaType){
            case 1:
                return new GoogleCaptchaVerifier();
            default:
                return null;
        }
    }
}
