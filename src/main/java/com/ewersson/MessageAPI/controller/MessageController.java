package com.ewersson.MessageAPI.controller;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message post(@RequestBody Message message){
        return messageService.addMessage(message);
    }
    
    @GetMapping("/{id}")
    public Optional<Message> getById(@PathVariable Integer id){
        return messageService.getById(id);
    }

    @GetMapping
    public Optional<List<Message>> getAll(){
        return Optional.ofNullable(messageService.getAll());
    }

    @PutMapping("/{id}")
    public Optional<Message> update(@PathVariable Integer id, @RequestBody Message message){
        return Optional.ofNullable(messageService.updateMessage(id, message));
    }

}