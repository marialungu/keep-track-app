package com.keeptrack.rest.api.keeptrackapi;

import com.keeptrack.rest.api.keeptrackapi.entity.Board;
import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.repository.BoardRepo;
import com.keeptrack.rest.api.keeptrackapi.service.BoardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Ria on 6/4/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRepo {
    private static final String APPLICATION_USER = "stark";
    @Mock
    private BoardRepo testBoardRepo;

    @InjectMocks
    private BoardService boardService;

    @Test
    public void testBoardRepo(){
        createNewBoard("work", "red");
        List<Board> boardList = boardService.getAllBoard();
        for(Board board : boardList){
            List<Note> notes = board.getNotes();
            System.out.print(notes);
        }
    }

    public void createNewBoard(String boardName, String boardColor){
        Board newBoard = new Board();

        newBoard.setBoardColor(boardColor);
        newBoard.setBoardName(boardName);
        newBoard.setBoardCreatedAt(new Date());
        newBoard.setUserId(APPLICATION_USER);

        testBoardRepo.save(newBoard);
    }
}
