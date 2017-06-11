package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.repository.BoardRepo;
import com.keeptrack.rest.api.keeptrackapi.repository.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */
@Service
public class NoteService {
    @Autowired
    private NoteRepo noteRepo;
    @Autowired
    private BoardRepo boardRepo;

    private static final Long DEFAULT_BOARD_ID = 1l;

    public void createNewNote(String noteName, String noteContent, Long boardId){

        Note newNote = new Note();
        newNote.setNoteName(noteName);
        newNote.setNoteCreatedAt(new Date());
        newNote.setNoteContent(noteContent);
        if (boardId != null){
            newNote.setBoard(boardRepo.findOne(boardId));
        } else {
            newNote.setBoard(boardRepo.findOne(DEFAULT_BOARD_ID));
        }

        noteRepo.save(newNote);
    }

    public void updateNote(Long noteId, String noteContent){
        Note note = noteRepo.findOne(noteId);
        note.setNoteContent(noteContent);
        noteRepo.save(note);
    }

    public List<Note> getAllNote(){
        return noteRepo.findAll();
    }
}
