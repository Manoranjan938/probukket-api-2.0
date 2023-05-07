package com.api.user.exception;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
