package com.api.user.service;

import com.api.user.exception.CustomException;
import com.api.user.repo.UserRepository;
import com.api.user.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    private String createUser(UserRequest request){
        try{

        }catch(Exception e){
            throw new CustomException("User Creation failed");
        }
        return null;
    }

}
