package com.asses.bookstore.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class UserException  extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public UserException(String message){

        super(message);
    }

    public UserException(String message, Throwable throwable){

        super(message, throwable);
    }
}
