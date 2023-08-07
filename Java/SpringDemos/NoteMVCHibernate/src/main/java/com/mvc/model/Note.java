package com.mvc.model;

import javax.persistence.*;

@Entity
@Table(name = "note")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "noteId")
    private int noteId;

    @Column(name = "noteTitle")
    private String noteTitle;

    @Column(name = "noteDesc")
    private String noteText;

    @Column(name = "noteCategory")
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
