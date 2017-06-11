package com.keeptrack.rest.api.keeptrackapi.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "NOTES")
public class Note {
    @Id
    @Column (name = "n_id")
    @GeneratedValue
    private Long noteId;

    @Column (name = "n_name")
    private String noteName;

    @Column (name = "n_checked")
    private Boolean noteChecked;

    @Column (name = "n_content")
    private String noteContent;

    @Column (name = "n_created_at")
    private Date noteCreatedAt;

    @Column (name = "n_b_id", insertable = false, updatable = false)
    private String boardId;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name ="n_b_id")
    private Board board;


    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public Boolean getNoteChecked() {
        return noteChecked;
    }

    public void setNoteChecked(Boolean noteChecked) {
        this.noteChecked = noteChecked;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public Date getNoteCreatedAt() {
        return noteCreatedAt;
    }

    public void setNoteCreatedAt(Date noteCreatedAt) {
        this.noteCreatedAt = noteCreatedAt;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public Board getBoard() {        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
