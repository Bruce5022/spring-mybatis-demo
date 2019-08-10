package com.sky.controller;

import com.sky.model.User;
import com.sky.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/getUsers")
    public String getUsers(Model model){
        List<User> userList = demoService.getUserList();
        model.addAttribute("users",userList);
        return "list";
    }
}
