package com.keeptrack.rest.api.keeptrackapi.service;

import com.keeptrack.rest.api.keeptrackapi.entity.User;
import com.keeptrack.rest.api.keeptrackapi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ria on 5/28/2017.
 */
@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
