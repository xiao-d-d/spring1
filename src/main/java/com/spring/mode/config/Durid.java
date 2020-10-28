package com.spring.mode.config;

import com.spring.mode.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Durid {
    @Bean
    public User user(){
        User user = new User();
        user.setUsername("test");
        return user;
    }
}
