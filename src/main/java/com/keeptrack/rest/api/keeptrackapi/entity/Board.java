package com.keeptrack.rest.api.keeptrackapi.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "BOARDS")
public class Board {
    @Id
    @Column (name = "b_id")
    @GeneratedValue
    private Long boardId;

    @Column (name = "b_name")
    private String boardName;

    @Column (name = "b_color")
    private String boardColor;

    @Column (name = "b_created_at")
    private Date boardCreatedAt;

    @Column (name = "b_u_id")
    private String userId;

    @OneToMany(mappedBy = "boardId")
    private List<Note> notes;

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardColor() {
        return boardColor;
    }

    public void setBoardColor(String boardColor) {
        this.boardColor = boardColor;
    }

    public Date getBoardCreatedAt() {
        return boardCreatedAt;
    }

    public void setBoardCreatedAt(Date boardCreatedAt) {
        this.boardCreatedAt = boardCreatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}
