package Mediscreenmsnotes.service;

import Mediscreenmsnotes.model.Note;
import Mediscreenmsnotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("NoteService")
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public Note createNote(Note note ) {

        return noteRepository.save(note);
    }


    public List<Note> findAllNotes() {

        return noteRepository.findAll();

    }


}
