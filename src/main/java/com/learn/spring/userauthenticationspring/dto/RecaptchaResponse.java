package com.learn.spring.userauthenticationspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RecaptchaResponse {
    private boolean success;
    private String hostname;
    private float score;
    private String action;
    private String challenge_ts;
    @JsonProperty("error-codes")
    private String[] errorCodes;
}
