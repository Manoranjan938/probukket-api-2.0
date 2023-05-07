package com.api.user.controller;

import com.api.user.request.UserRequest;
import com.api.user.service.UserService;
import com.api.user.utils.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Validation validation;

    @GetMapping("/users-list")
    public ResponseEntity<String> allUsersList(){

        return null;
    }

    @PostMapping("/new-user")
    public ResponseEntity<?> createNewUser(@Valid @RequestBody UserRequest request, BindingResult result){

        ResponseEntity<?> error = validation.validationService(result);
        if(error != null){
            return error;
        }

        String user = userService.createUser(request);

        return new ResponseEntity<String>(user, HttpStatus.CREATED);
    }

}
