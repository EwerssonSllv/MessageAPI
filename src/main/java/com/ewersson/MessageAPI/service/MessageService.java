package com.ewersson.MessageAPI.service;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addMessage(Message message){
        messageRepository.save(message);
        return message;
    }

    public Optional<Message> getById(Integer id){
        return messageRepository.findById(id);
    }

    public List<Message> getAll(){
        return messageRepository.findAll();
    }

    public Message updateMessage(Integer id, Message updatedMessage){
        Message message = messageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found!"));

        message.setText(updatedMessage.getText());

        return messageRepository.save(message);
    }

}