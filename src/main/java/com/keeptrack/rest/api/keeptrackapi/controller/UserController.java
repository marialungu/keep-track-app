package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.entity.User;
import com.keeptrack.rest.api.keeptrackapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //nice to have
    @RequestMapping("/login")
    public ModelAndView authenticationPage(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }
}
