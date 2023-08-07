package com.spring.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.exception.NoteAlreadyExists;
import com.spring.mongo.exception.NoteNotFoundException;
import com.spring.mongo.model.Note;
import com.spring.mongo.service.INoteService;

@RestController
@RequestMapping("api/v1")
public class NoteController {
//	http://localhost:8080/api/v1/adduser
//	http://localhost:8080/api/v1/getalluser
//	http://localhost:8080/api/v1/deluser
//	http://localhost:8080/api/v1/updateuser
//	http://localhost:8080/api/v1/getuserbyid
	
	@Autowired
	private INoteService noteService;
	
	private ResponseEntity<?> responseEntity;
	
	@PostMapping("/addNote")
	public ResponseEntity<?> saveNoteHandler(@RequestBody Note uobj){
		try {
			Note newNote = this.noteService.saveNote(uobj);
			responseEntity = new ResponseEntity<>(newNote, HttpStatus.CREATED);
		} catch (NoteAlreadyExists e) {
			e.printStackTrace();
		}
		return responseEntity;	
	}
	
	@GetMapping("/getAllNotes")
	public ResponseEntity<?> getAllNotesHandler(){
		List<Note> allNotes = this.noteService.getAllNotes();
		responseEntity = new ResponseEntity<>(allNotes, HttpStatus.OK);
		return responseEntity;	
	}
	
	@GetMapping("/getNoteById/{noteId}")
	public ResponseEntity<?> getNoteById(@PathVariable int noteId){

		Note note = null;
		try {
			note = this.noteService.getNoteById(noteId);
			responseEntity = new ResponseEntity<>(note, HttpStatus.OK);
		} catch (NoteNotFoundException e) {
			responseEntity = new ResponseEntity<>(note, HttpStatus.CONFLICT);
		}
		return responseEntity;	
	}
	
	@PutMapping("/updateNote/{noteId}")
	public ResponseEntity<?> updateNote(@PathVariable int noteId, @RequestBody Note obj){

		Note note = null;
		try {
			note = this.noteService.updateNote(obj, noteId);
			responseEntity = new ResponseEntity<>(note, HttpStatus.OK);
		} catch (NoteNotFoundException e) {
			responseEntity = new ResponseEntity<>(note, HttpStatus.CONFLICT);
		}
		return responseEntity;	
	}
	
	@DeleteMapping("/delNote/{noteId}")
	public ResponseEntity<?> deleteNote(@PathVariable int noteId){

		boolean note = false;
		try {
			note = this.noteService.delNote(noteId);
			responseEntity = new ResponseEntity<>(note, HttpStatus.OK);
		} catch (NoteNotFoundException e) {
			responseEntity = new ResponseEntity<>(note, HttpStatus.CONFLICT);
		}
		return responseEntity;	
	}
	
	
}
