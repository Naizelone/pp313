package com.example.pp3_1_2.controller;

import com.example.pp3_1_2.entity.User;
import com.example.pp3_1_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class IndexController {

    private final UserService userService;
    @Autowired
    public IndexController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/index")
    public String indexShow(){
        return "index";
    }

    @RequestMapping("/")
    public String indexShow2(){
        return "index";
    }

    @PreAuthorize ("hasAuthority('permission:user')")
    @RequestMapping("/user")
    public String userPage(Model model, Principal principal) {
        System.out.println(principal.getName());
        User user = userService.findUserByEmail(principal.getName());
        model.addAttribute("user", user);
        return "user";
    }
}
