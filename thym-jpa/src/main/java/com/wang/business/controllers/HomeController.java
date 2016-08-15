package com.wang.business.controllers;

import com.wang.business.util.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;
import java.util.Map;

/**
 * Created by wangqi on 16/8/12.
 */
@Controller
public class HomeController {

    @Autowired
    private Session session;

    @RequestMapping("/")
    public String homepage(Map<String,Object> model) {
        model.put("today", Calendar.getInstance());
        model.put("name","wangqi");
        model.put("welcome","Welcome to our <h2>grocery store</h2>, wangqi (from default messages)!");
        return "home";
    }
}
