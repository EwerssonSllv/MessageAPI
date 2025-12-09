package com.ewersson.MessageAPI.repository;

import com.ewersson.MessageAPI.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findByTextContaining(String word);
}