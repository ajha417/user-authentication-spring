package com.learn.spring.userauthenticationspring.enums;

public enum ECaptchaVerifier {
    GOOGLE_RECAPTCHA_VER(1);

    private int verifierType;

    private ECaptchaVerifier(int verifierType){
        this.verifierType = verifierType;
    }
}
