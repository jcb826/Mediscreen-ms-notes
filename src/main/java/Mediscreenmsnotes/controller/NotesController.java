package Mediscreenmsnotes.controller;

import Mediscreenmsnotes.model.Note;
import Mediscreenmsnotes.repository.NoteRepository;
import Mediscreenmsnotes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("patHistory")
public class NotesController {


    @Autowired
    NoteService noteService;


    @PostMapping("/add")
    public Note addNote(@RequestBody @Valid Note note) {
        return noteService.createNote(note);
    }

}
