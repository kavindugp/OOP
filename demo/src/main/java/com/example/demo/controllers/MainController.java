package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.AppUsersRepo;

@Controller
public class MainController {
	
	@Autowired
	AppUsersRepo appRepo;
	
	@RequestMapping("/")
    public ModelAndView doHome(){

        ModelAndView modelAndView=new ModelAndView("index");
        modelAndView.addObject("lists",appRepo.findAll());
        return modelAndView;
    }

}
