package com.ewersson.MessageAPI.controller;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message post(@RequestBody Message message){
        return messageService.addMessage(message);
    }

}