package com.khela.rest;

import com.khela.domain.Role;
import com.khela.domain.User;
import com.khela.service.RoleService;
import com.khela.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.util.NestedServletException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController()
@RequestMapping(value = "/rest/public")
public class PublicRestController {
    private final RoleService roleService;
    private final UserService userService;

    public PublicRestController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<Long> addUser(@RequestBody User user, @RequestParam("roleName") String roleName){
        Role role = roleService.getRoleDetails(roleName);
        user.setRoles(Stream.of(role).collect(Collectors.toSet()));
        return ResponseEntity.ok(userService.addUser(user));
    }

}
