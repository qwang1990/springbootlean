package com.example.controller;

import com.example.domain.WiselyMessage;
import com.example.domain.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by wangqi on 16/7/11.
 */
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, "+message.getName()+"!");
    }

    @MessageMapping("/chat")
    public void handleChat(Principal principal,String message) {
        if (principal.getName().equals("wyf")) {
            simpMessagingTemplate.convertAndSendToUser("wisely",
                    "/queue/notifications", principal.getName() + "-send:" + message);
        } else {
            simpMessagingTemplate.convertAndSendToUser("wyf",
                    "/queue/notifications",principal.getName()+"-send:"+message);
        }
    }
}
