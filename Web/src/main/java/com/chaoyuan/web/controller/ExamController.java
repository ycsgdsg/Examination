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
 * Created by chaoyuan on 08/19/2016.
 */
@Controller
@RequestMapping("/coding")
public class ExamController {

    @Autowired
    private ParticipantService participantService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("exam");
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public ModelAndView submit(@RequestBody String code) {
        return new ModelAndView("result");
    }
}