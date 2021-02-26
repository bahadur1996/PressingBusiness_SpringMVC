package com.khela.utils;

import com.khela.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public interface AuthenticationManagerService {
    User getLoggedInUser();
    Boolean isLoggedIn();
    Boolean hasRole(String roleName);
}
