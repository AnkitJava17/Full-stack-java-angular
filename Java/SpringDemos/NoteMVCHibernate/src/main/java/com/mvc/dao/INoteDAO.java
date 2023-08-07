package com.mvc.dao;

import com.mvc.model.Note;

import java.util.List;

public interface INoteDAO
{
    public boolean saveNote(Note note);

    public boolean updateNote(int noteId,Note note);

    public boolean deleteNote(int noteId);

    public List<Note> getAllNote();
}
