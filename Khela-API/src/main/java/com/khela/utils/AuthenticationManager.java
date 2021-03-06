package com.khela.utils;

import com.khela.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationManager {

    private static AuthenticationManagerService authenticationManagerService;

    public AuthenticationManager(AuthenticationManagerService authenticationManagerService) {
        AuthenticationManager.authenticationManagerService = authenticationManagerService;
    }

    public static User getLoggedInUser(){
        return authenticationManagerService.getLoggedInUser();
    }
    public static boolean isLoggedIn(){
        return authenticationManagerService.isLoggedIn();
    }
    public Boolean hasRole(String roleName){
        return authenticationManagerService.hasRole(roleName);
    }

}
