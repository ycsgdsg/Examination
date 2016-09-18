package com.chaoyuan.web.controller;

import com.chaoyuan.controller.service.ParticipantService;
import com.chaoyuan.database.type.ParticipantDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chaoyuan on 08/09/2016.
 */

@Controller
@RequestMapping("/start")
public class StartController {

    @Autowired
    private ParticipantService participantService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("start");
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView start(@RequestBody ParticipantDB participant) {
        participantService.save(participant);
        return new ModelAndView("exam");
    }
}
