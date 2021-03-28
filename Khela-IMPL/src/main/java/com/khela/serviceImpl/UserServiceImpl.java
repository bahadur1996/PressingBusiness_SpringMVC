package com.khela.serviceImpl;

import com.khela.domain.User;
import com.khela.mapper.UserMapper;
import com.khela.repository.UserRepository;
import com.khela.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public Long addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(userMapper.domainToEntity().map(user)).getId();
    }

    @Override
    public Long editUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public User getUserDetails(Long userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
