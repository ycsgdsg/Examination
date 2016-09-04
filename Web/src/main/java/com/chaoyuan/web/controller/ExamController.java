package com.chaoyuan.web.controller;

import com.chaoyuan.controller.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chaoyuan on 08/19/2016.
 */
@Controller
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ParticipantService participantService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView get(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("exam");
    }
}