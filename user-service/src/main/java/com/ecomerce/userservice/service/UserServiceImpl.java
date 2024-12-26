package com.ecomerce.userservice.service;

import com.ecomerce.userservice.controller.request.RequestUser;
import com.ecomerce.userservice.domain.User;
import com.ecomerce.userservice.dto.UserDto;
import com.ecomerce.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(RequestUser request) {
        var user = User.builder()
                .email(request.getEmail())
                .pwd(passwordEncoder.encode(request.getPwd()))
                .name(request.getName())
                .build();

        userRepository.save(user);

        return UserDto.builder()
                .email(user.getEmail())
                .name(user.getName())
                .build();
    }
}
