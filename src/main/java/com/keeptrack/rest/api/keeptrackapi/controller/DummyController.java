package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.entity.Dummy;
import com.keeptrack.rest.api.keeptrackapi.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping("/dummy")
    public ModelAndView showAllDummy(Long... a){
        String random = "Hello World!";

        List<Dummy> dummyList = dummyService.getAllDummy();

        ModelAndView model =  new ModelAndView("dummy", "dummy-stuff", random);
        model.addObject("dummy", dummyList);

        return model;
    }
}
