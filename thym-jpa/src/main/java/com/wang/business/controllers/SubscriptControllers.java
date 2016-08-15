package com.wang.business.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangqi on 16/8/12.
 */
@Controller
public class SubscriptControllers {
    @RequestMapping("/subscribe")
    public String subscript() {
        return "/subscribe";
    }
}
