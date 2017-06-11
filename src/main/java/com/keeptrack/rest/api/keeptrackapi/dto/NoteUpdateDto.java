package com.keeptrack.rest.api.keeptrackapi.dto;

/**
 * Created by Ria on 6/11/2017.
 */
public class NoteUpdateDto {
    private String noteContent;
    private Long noteId;

    NoteUpdateDto(){
    }

    public NoteUpdateDto(String noteName, Long noteId){
        this.noteId = noteId;
        this.noteContent =noteName ;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }
}
