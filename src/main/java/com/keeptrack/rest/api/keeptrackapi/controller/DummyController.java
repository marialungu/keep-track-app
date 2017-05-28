package com.keeptrack.rest.api.keeptrackapi.controller;

import com.keeptrack.rest.api.keeptrackapi.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyController {

    @Autowired
    private DummyService dummyService;

    @RequestMapping("/dummy")
    public ModelAndView showAllDummy(){
        String random = "Hello World!";

        dummyService.getAllDummy();

        return new ModelAndView("dummy", "dummy-stuff", random);
    }
}
