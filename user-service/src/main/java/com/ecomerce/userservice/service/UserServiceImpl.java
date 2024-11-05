package com.ecomerce.userservice.service;

import com.ecomerce.userservice.controller.request.RequestUser;
import com.ecomerce.userservice.domain.User;
import com.ecomerce.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(RequestUser request) {
        var user = User.builder()
                .email(request.getEmail())
                .pwd(request.getPwd())
                .name(request.getName())
                .build();

        userRepository.save(user);
    }
}
