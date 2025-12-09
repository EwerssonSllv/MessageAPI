package com.ewersson.MessageAPI.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "message")
public class Message{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;

    public Message(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Message() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{text='" + text + "'}";
    }
}