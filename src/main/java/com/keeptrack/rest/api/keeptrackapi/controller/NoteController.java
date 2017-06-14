package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.dto.BoardDto;
import com.keeptrack.rest.api.keeptrackapi.dto.NoteDto;
import com.keeptrack.rest.api.keeptrackapi.dto.NoteUpdateDto;
import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @ResponseBody
    @RequestMapping(value = "/add-new-note", method = RequestMethod.POST)
    public void addNotesViaAjax(@RequestBody NoteDto noteData) {

        noteService.createNewNote(noteData.getNoteName(), noteData.getNoteContent(), noteData.getBoardId());
    }

    @ResponseBody
    @RequestMapping(value="/update-note", method = RequestMethod.POST)
    public void updateNote(@RequestBody NoteUpdateDto noteUpdateDto){

        noteService.updateNote(noteUpdateDto.getNoteId(), noteUpdateDto.getNoteContent());
    }

    //nice to have
    @RequestMapping("/delete-note")
    public ModelAndView deleteNote(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

    //nice to have
    @RequestMapping("/check-note-item")
    public ModelAndView checkNoteItem(Long... a){

        ModelAndView model =  new ModelAndView("login", "login-page", "");

        return model;
    }

}

