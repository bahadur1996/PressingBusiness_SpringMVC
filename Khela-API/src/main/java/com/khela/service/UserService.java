package com.khela.service;

import com.khela.domain.User;

import java.util.List;

public interface UserService {
    Long addUser(User user);
    Long editUser(User user);
    void deleteUser(Long userId);
    User getUserDetails(Long userId);
    List<User> getAllUsers();
}
