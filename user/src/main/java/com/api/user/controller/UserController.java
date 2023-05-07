package com.api.user.controller;

import com.api.user.request.UserRequest;
import com.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users-list")
    public ResponseEntity<String> allUsersList(){

        return null;
    }

    @PostMapping("/new-user")
    public ResponseEntity<String> createNewUser(@RequestBody UserRequest request){



        return null;
    }

}
