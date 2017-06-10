package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */
@Service
public class NoteService {
    @Autowired
    private NoteRepo noteRepo;

    public List<Note> getAllNote(){
        return noteRepo.findAll();
    }
}
