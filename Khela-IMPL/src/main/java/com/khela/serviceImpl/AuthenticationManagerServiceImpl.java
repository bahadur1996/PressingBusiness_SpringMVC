package com.khela.serviceImpl;

import com.khela.domain.User;
import com.khela.repository.UserRepository;
import com.khela.utils.AuthenticationManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthenticationManagerServiceImpl implements AuthenticationManagerService {

    @Autowired
    private UserRepository userRepository;

    public User getLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        User user = (User) authentication.getPrincipal();

        return user;

    }

    public  Boolean isLoggedIn(){
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
