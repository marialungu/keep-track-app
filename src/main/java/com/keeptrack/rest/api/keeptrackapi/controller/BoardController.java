package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.entity.Board;
import com.keeptrack.rest.api.keeptrackapi.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/keep-track")
    public ModelAndView mainKeepTrack(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/add-new-board")
    public ModelAndView addNewBoard(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/update-board")
    public ModelAndView updateBoard(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/delete-board")
    public ModelAndView deleteBoard(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

}