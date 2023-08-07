package com.spring.mongo.service;

import java.util.List;

import com.spring.mongo.exception.NoteAlreadyExists;
import com.spring.mongo.exception.NoteNotFoundException;
import com.spring.mongo.model.Note;

public interface INoteService {
	public Note saveNote(Note nObj) throws NoteAlreadyExists;
	public Note updateNote(Note nObj, int nid) throws NoteNotFoundException;
	public Note getNoteById(int nid) throws NoteNotFoundException;
	public List<Note> getAllNotes();
	public boolean delNote(int nid) throws NoteNotFoundException;

}
