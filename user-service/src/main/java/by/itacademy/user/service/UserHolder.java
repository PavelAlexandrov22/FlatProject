package by.itacademy.user.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserHolder {

    public UserDetailServiceImpl getUser(){
        return (UserDetailServiceImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }



}
