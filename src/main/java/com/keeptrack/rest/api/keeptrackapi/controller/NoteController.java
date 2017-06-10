package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping("/add-new-note")
    public ModelAndView addNewNote(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/update-note")
    public ModelAndView updateNote(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/delete-note")
    public ModelAndView deleteNote(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    @RequestMapping("/check-note-item")
    public ModelAndView checkNoteItem(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

}

