package com.keeptrack.rest.api.keeptrackapi;

import com.keeptrack.rest.api.keeptrackapi.entity.Board;
import com.keeptrack.rest.api.keeptrackapi.entity.Note;
import com.keeptrack.rest.api.keeptrackapi.repository.BoardRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created by Ria on 6/4/2017.
 */
@SpringBootTest
public class TestRepo {
    @Autowired
    private BoardRepo testBoardRepo;
     @Test
    public void testBoardRepo(){
        List<Board> boardList = testBoardRepo.findAll();
        for(Board board : boardList){
            List<Note> notes = board.getNotes();
            System.out.print(notes);
        }
    }

}
