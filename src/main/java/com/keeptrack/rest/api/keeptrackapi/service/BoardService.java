package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.Board;
import com.keeptrack.rest.api.keeptrackapi.repository.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */
@Service
public class BoardService {
    @Autowired
    private BoardRepo boardRepo;

    public List<Board> getAllBoard(){
        return boardRepo.findAll();
    }
}
