package com.learn.spring.userauthenticationspring.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity.formLogin(httpForm-> {
            httpForm.loginPage("/auth/login").permitAll();
        }).authorizeHttpRequests(registery -> {
            registery.requestMatchers("/auth/register", "/static/css/**", "/static/js/**", "/static/**").permitAll();
            registery.anyRequest().authenticated();
        }).build();
    }
}
