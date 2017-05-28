package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.Dummy;
import com.keeptrack.rest.api.keeptrackapi.repository.DummyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */
@Service
public class DummyService {
    @Autowired
    private DummyRepo dummyRepo;

    public List<Dummy> getAllDummy(){
        return dummyRepo.findAll();
    }
}
