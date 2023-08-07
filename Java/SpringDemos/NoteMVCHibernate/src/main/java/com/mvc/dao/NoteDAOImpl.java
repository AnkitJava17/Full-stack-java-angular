package com.mvc.dao;

import com.mvc.model.Note;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class NoteDAOImpl implements INoteDAO
{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean saveNote(Note note) {

        try
        {
            this.sessionFactory.getCurrentSession().save(note);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updateNote(int noteId, Note note) {
        try
        {
            note = this.sessionFactory.getCurrentSession().load(Note.class,noteId);

            note.setNoteId(1);
            note.setNoteTitle("test");
            note.setNoteText("Test text");
            note.setNoteCategory("test Cat");

            this.sessionFactory.getCurrentSession().save(note);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteNote(int noteId) {
        try
        {
            Note note = this.sessionFactory.getCurrentSession().load(Note.class,noteId);
            this.sessionFactory.getCurrentSession().delete(note);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Note> getAllNote() {
        return this.sessionFactory.getCurrentSession().createQuery("from Note").list();
    }
}
