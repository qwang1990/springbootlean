package com.example.controller;

import com.example.domain.WiselyMessage;
import com.example.domain.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by wangqi on 16/7/11.
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponses")
    public WiselyResponse say(WiselyMessage message) throws InterruptedException {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome, "+message.getName()+"!");
    }
}
