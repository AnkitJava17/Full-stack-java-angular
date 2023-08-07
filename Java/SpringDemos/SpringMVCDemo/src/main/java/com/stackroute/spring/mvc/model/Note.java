package com.stackroute.spring.mvc.model;

public class Note 
{
	private int noteId;
	private String noteTitle;
	private String noteText;
	private String noteCategory;
	
	public int getNoteId() {
		return noteId;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteText() {
		return noteText;
	}
	public void setNoteText(String noteText) {
		this.noteText = noteText;
	}
	public String getNoteCategory() {
		return noteCategory;
	}
	public void setNoteCategory(String noteCategory) {
		this.noteCategory = noteCategory;
	}
	
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteText=" + noteText + ", noteCategory="
				+ noteCategory + "]";
	}
}
