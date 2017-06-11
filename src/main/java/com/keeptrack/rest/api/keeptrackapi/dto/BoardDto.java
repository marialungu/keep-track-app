package com.keeptrack.rest.api.keeptrackapi.dto;

/**
 * Created by Ria on 6/11/2017.
 */
public class BoardDto {
    private String boardName;
    private String boardColor;

    public BoardDto(String boardName, String boardColor){
        this.boardName = boardName;
        this.boardColor = boardColor;
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
}
