package com.ewersson.MessageAPI.repository;

import com.ewersson.MessageAPI.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}