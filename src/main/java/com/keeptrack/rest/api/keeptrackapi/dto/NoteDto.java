package com.keeptrack.rest.api.keeptrackapi.dto;

/**
 * Created by Ria on 6/11/2017.
 */
public class NoteDto {
    private String noteName;
    private String noteContent;
    private Long boardId;

    NoteDto(){
    }

    public NoteDto(String noteName, String noteContent, Long boardId){
        this.noteName = noteName;
        this.noteContent = noteContent;
        this.boardId = boardId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }
}
