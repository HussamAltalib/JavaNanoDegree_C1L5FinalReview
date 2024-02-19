package com.udacity.jwdnd.c1.review.controller;

import com.udacity.jwdnd.c1.review.service.MessagService;
import com.udacity.jwdnd.c1.review.model.ChatForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private MessagService messageService;

    public ChatController(MessagService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(ChatForm newChatForm, Model model){
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }
    @PostMapping
    public String postChatPage(ChatForm chatForm, Model model){
        this.messageService.addMessage(chatForm);
        chatForm.setMessageText("");
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes () { return new String[] { "Say", "Shout", "Whisper" }; }
}
