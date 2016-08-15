package com.wang.business.controllers;

import com.wang.business.entities.User;
import com.wang.business.util.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by wangqi on 16/8/12.
 */
@Controller
public class UserProfileController {
    @Autowired
    Session session;

    @RequestMapping("/userprofile")
    private String userProfile(Map<String,Object> model) {
        model.put("user",new User("qi","wang","cn",25));
        //session.setUser(new User("qi","wang","cn",25));
        return "userprofile";
    }
}
