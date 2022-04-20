package com.shekor.UserManagerApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserManagerController {

    @GetMapping("")
    public String showHomePage(){
        return "index";
    }
}
