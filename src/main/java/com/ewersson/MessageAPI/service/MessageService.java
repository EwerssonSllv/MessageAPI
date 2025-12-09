package com.ewersson.MessageAPI.service;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void addMessage(Message message){
        messageRepository.save(message);
    }

}