package com.stackroute.spring.mvc.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.spring.mvc.model.Note;

public class NoteRepository 
{
	
	public List<Note> noteData;
	
	public NoteRepository()
	{
		this.noteData = new ArrayList();
	}
	
	
	public List<Note> getNotes()
	{
		return noteData;
	}
	
	public void setNotes(List<Note> noteData)
	{
		this.noteData =  noteData;
	}
	
	public void addNote(Note note)
	{
		this.noteData.add(note);
	}
	
	public void deleteNote(int noteId)
	{
//		this.noteData.removeIf(note -> note.getNoteId() == noteId);
		this.noteData.remove(noteId);
	}
}