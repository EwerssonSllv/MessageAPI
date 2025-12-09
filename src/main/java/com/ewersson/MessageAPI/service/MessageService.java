package com.ewersson.MessageAPI.service;

import com.ewersson.MessageAPI.entities.Message;
import com.ewersson.MessageAPI.repository.MessageRepository;
import com.ewersson.MessageAPI.service.exception.MessageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addMessage(Message message){
        messageRepository.save(message);
        return message;
    }

    public Message getById(Integer id){
        return messageRepository.findById(id)
                .orElseThrow(() -> new MessageNotFoundException("Message not found!"));
    }

    public List<Message> getAll(){
        return messageRepository.findAll();
    }

    public List<Message> getMessagesByWord(String word){
        return messageRepository.findByTextContaining(String.valueOf(word));
    }

    public Message updateMessage(Integer id, Message updatedMessage){
        Message message = messageRepository.findById(id)
                .orElseThrow(() -> new MessageNotFoundException("Message not found!"));

        message.setText(updatedMessage.getText());

        return messageRepository.save(message);
    }

}