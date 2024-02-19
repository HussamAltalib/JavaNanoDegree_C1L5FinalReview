package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    public String username;
    public String messageText;

    public ChatMessage() {

    }
    public ChatMessage(String username, String messageText) {
        this.username = username;
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
