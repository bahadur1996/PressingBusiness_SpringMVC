package com.example.utils;

import com.example.entity.UserEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Set;
import java.util.stream.Collectors;


public class AuthenticationManagerUtil {



    public UserEntity getLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return ((UserEntity) authentication.getPrincipal());
    }

    public Boolean hasRole(String roleName){
        Set<String> roles = getLoggedInUser().getRoles().stream().map(role -> role.getRoleName()).collect(Collectors.toSet());

        return roles.contains(roleName)?true:false;
    }

}
