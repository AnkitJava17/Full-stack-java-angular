package com.mvc.controller;

import com.mvc.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class NoteController
{
    @Autowired
    private com.mvc.dao.INoteDAO noteDAO;

    @GetMapping("/")
    public ModelAndView getHomePage() {

        System.out.println("Inside get home page method");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("noteList", noteDAO.getAllNote());
        return modelAndView;
    }

    @PostMapping("/saveNote")
    public String saveNote(@ModelAttribute("note") Note note, ModelMap modelMap) {

        boolean status = noteDAO.saveNote(note);
        modelMap.addAttribute("noteList", noteDAO.getAllNote());
        return "index";
    }
}
