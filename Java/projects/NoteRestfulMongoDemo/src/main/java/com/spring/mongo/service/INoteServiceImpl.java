package com.spring.mongo.service;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mongo.exception.NoteAlreadyExists;
import com.spring.mongo.exception.NoteNotFoundException;
import com.spring.mongo.model.Note;
import com.spring.mongo.repository.INoteRepository;

public class INoteServiceImpl implements INoteService {

	@Autowired
	private INoteRepository noteRepository;
	
	@Override
	public Note saveNote(Note nObj) throws NoteAlreadyExists {
		// TODO Auto-generated method stub
		Optional<Note> optional = this.noteRepository.findById(nObj.getId());
		Note addnobj = null;
		
		if (optional.isPresent()) {
			System.out.println("User already exists");
			throw new NoteAlreadyExists();
		}else {
			addnobj = this.noteRepository.save(nObj);
		}
		
		return addnobj;
	}

	@Override
	public Note updateNote(Note nObj, int nid) throws NoteNotFoundException {
		// TODO Auto-generated method stub
		Optional<Note> optional = this.noteRepository.findById(nid);
		
		Note noteObj = null;
		Note updatedNote = null;
		
		if (optional.isPresent()) {
			noteObj = optional.get();
			
			noteObj.setTitle(nObj.getTitle());
			noteObj.setText(nObj.getText());	
			
			updatedNote = this.noteRepository.save(noteObj);
		}
		else {
			throw new NoteNotFoundException();
		}
		return updatedNote;
	}

	@Override
	public Note getNoteById(int nid) throws NoteNotFoundException {
		// TODO Auto-generated method stub
		Optional<Note> optional = this.noteRepository.findById(nid);
		
		Note noteObj = null;
		
		if (optional.isPresent()) {
			noteObj = optional.get();
		}else {
			throw new NoteNotFoundException();
		}
		
		return noteObj;
	}

	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		List<Note> notes = new ArrayList<>();
		
		notes = this.noteRepository.findAll();
		return notes;
	}

	@Override
	public boolean delNote(int nid) throws NoteNotFoundException {
		// TODO Auto-generated method stub
		Optional<Note> optional = this.noteRepository.findById(nid);
		
		boolean status = false;
		if (optional.isPresent()) {
			this.noteRepository.delete(optional.get());
			
			status = true;
		}else {
			throw new NoteNotFoundException();
		}
		return status;
	}

}
