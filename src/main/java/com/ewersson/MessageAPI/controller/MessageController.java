package com.ewersson.MessageAPI.controller;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public Message getById(@PathVariable Integer id){
        return messageService.getById(id);
    }

    @GetMapping("/byword/{word}")
    public List<Message> getByWord(@PathVariable String word) {
        return messageService.getMessagesByWord(word);
    }

    @GetMapping
    public List<Message> getAll(){
        return messageService.getAll();
    }

    @PutMapping("/{id}")
    public Message update(@PathVariable Integer id, @RequestBody Message message){
        return messageService.updateMessage(id, message);
    }

}