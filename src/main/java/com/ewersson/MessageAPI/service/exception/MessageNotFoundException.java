package com.ewersson.MessageAPI.service.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MessageNotFoundException extends EntityNotFoundException {

    public MessageNotFoundException(String message){
        super(message);
    }

}