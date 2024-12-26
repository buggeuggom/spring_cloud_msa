package com.ecomerce.userservice.controller;

import com.ecomerce.userservice.controller.request.RequestUser;
import com.ecomerce.userservice.controller.response.ResponseUser;
import com.ecomerce.userservice.dto.UserDto;
import com.ecomerce.userservice.service.UserService;
import com.ecomerce.userservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final Greeting greeting;
    private final UserService userService;

    @GetMapping("/health-check")
    public String staus() {
        //return greeting.getMessage();

        return "OK";
    }

    @PostMapping("/users")
    public ResponseEntity<ResponseUser> creatUser(@RequestBody RequestUser request) {

        UserDto user = userService.createUser(request);

        return  ResponseEntity
                .status(CREATED)
                .body(new ResponseUser(user));
    }
}
