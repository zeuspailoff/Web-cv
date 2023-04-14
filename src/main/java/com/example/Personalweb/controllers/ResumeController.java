package com.example.Personalweb.controllers;

import com.example.Personalweb.configuracion.Paginas;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/resume")
public class ResumeController {
    @GetMapping("/resume")
    public String getName() {
        return "Resume";
    }


    @GetMapping(path = {"/projects"})
    public ModelAndView getProjects() {
        return new ModelAndView(Paginas.PROJECTS);
    }
    @GetMapping(path = {"/contact"})
    public ModelAndView getContact() {
        return new ModelAndView(Paginas.CONTACT);
    }
    @GetMapping(path = {"/home"})
    public ModelAndView getHome() {
        return new ModelAndView(Paginas.HOME);
    }
}
