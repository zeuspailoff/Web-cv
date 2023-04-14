package com.example.Personalweb.controllers;

import com.example.Personalweb.configuracion.Paginas;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//mapeamos
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping(path = {"/", "/post"})
    public String getName() {
        return "index";
    }


    @GetMapping(path = {"/resume"})
    public ModelAndView getResume() {
        return new ModelAndView(Paginas.RESUME);
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
