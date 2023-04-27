package com.kbstar.controller;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/resume")
    public String resume(){
        return "resume";
    }

    @RequestMapping("/projects")
    public String projects(){
        return "projects";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}
