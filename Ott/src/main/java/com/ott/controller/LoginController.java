package com.ott.controller;
import com.ott.entity.User;
import com.ott.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("/ottlogin")
public class LoginController {
    public UserService userService;
    @Autowired
    public LoginController(UserService userService){
    this.userService=userService;
    }

    @GetMapping("/showLoginPage")
    public String showLoginPage(){
        return "adminLogin";
    }
    @RequestMapping(value="/adminPage",method = {RequestMethod.GET, RequestMethod.POST})
    public String adminpage(Model model){
       List<User>  user=userService.findAll();
    model.addAttribute("users",user);
    return "adminPage";
    }

    @GetMapping("/accessDeniedPage")
    public String showAccessDeniedPage(){
        return "accessDenied";
    }
}