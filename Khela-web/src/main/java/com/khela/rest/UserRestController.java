package com.khela.rest;

import com.khela.domain.Role;
import com.khela.domain.User;
import com.khela.service.RoleService;
import com.khela.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController()
@RequestMapping(value = "/rest/user")
public class UserRestController {

    private final RoleService roleService;
    private final UserService userService;

    public UserRestController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }


    @GetMapping(value = "/logoutUrl")
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication!=null){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
        }
        response.sendRedirect("/");
    }
}
