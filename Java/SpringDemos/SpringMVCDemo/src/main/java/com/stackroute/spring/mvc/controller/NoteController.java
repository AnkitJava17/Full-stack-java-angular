package com.stackroute.spring.mvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.stackroute.spring.mvc.model.Note;
import com.stackroute.spring.mvc.repository.NoteRepository;

@Controller
public class NoteController 
{
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	
	Note note = ctx.getBean("note",Note.class);
	
	NoteRepository noterepository = ctx.getBean("noterepository",NoteRepository.class);
	
	
	public NoteController()
	{
		System.out.println("Note Controller Instantiated .........");
	}
	
	
	@GetMapping("/")
	public String getHomePage()
	{
		System.out.println("Taking to the home Page ......");
		return "index";
	}
	
	@PostMapping("/saveNote")
	public String saveNote(@ModelAttribute("note") Note note,ModelMap model)
	{
		System.out.println("Taking to the save note Page ......");
		
		this.noterepository.addNote(note);
		model.addAttribute("noteList1",this.noterepository.getNotes());
		
		return "index";
	}
}