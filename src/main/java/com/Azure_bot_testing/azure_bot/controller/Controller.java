package com.Azure_bot_testing.azure_bot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/message")
    public String getmsg(){
        return "Hi Sreenivas welcome to Azure bot";

    }
}
