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
    public ResponseEntity<Long> addUser(@RequestBody User user, @RequestParam("roleName") Long roleName){
        Role role = roleService.getRoleDetails(roleName);
        user.setRoles(Stream.of(role).collect(Collectors.toSet()));
        return ResponseEntity.ok(userService.addUser(user));
    }
    @GetMapping("/hamja")
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Okay");
    }
}
class AccessDeniedFilter extends GenericFilterBean {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        try {
            filterChain.doFilter(request, response);
        } catch (Exception e) {

            if (e instanceof NestedServletException &&
                    ((NestedServletException) e).getRootCause() instanceof AccessDeniedException) {

                HttpServletRequest rq = (HttpServletRequest) request;
                HttpServletResponse rs = (HttpServletResponse) response;

                if (isAjax(rq)) {
                    rs.sendError(HttpStatus.FORBIDDEN.value());
                } else {
                    rs.sendRedirect("/#sign-in");
                }
            }
        }
    }

    private Boolean isAjax(HttpServletRequest request) {
        return request.getContentType() != null &&
                request.getContentType().contains("application/json") &&
                request.getRequestURI() != null &&
                (request.getRequestURI().contains("api") || request.getRequestURI().contains("rest"));
    }
}