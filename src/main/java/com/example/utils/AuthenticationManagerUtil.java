package com.example.utils;

import com.example.domain.User;
import com.example.entity.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Set;
import java.util.stream.Collectors;


public class AuthenticationManagerUtil {


    @Autowired
    private UserRepository userRepository;

    public static User getLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        User user = (User) authentication.getPrincipal();

        return user;

    }

    public static boolean isLoggedIn(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication instanceof AnonymousAuthenticationToken)
            return false;

        return true;

    }


    public Boolean hasRole(String roleName){
        Set<String> roles = getLoggedInUser().getRoles().stream().map(role -> role.getRoleName()).collect(Collectors.toSet());

        return roles.contains(roleName)?true:false;
    }

}
