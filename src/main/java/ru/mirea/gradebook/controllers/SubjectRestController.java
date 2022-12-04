package ru.mirea.gradebook.controllers;

import org.springframework.web.bind.annotation.*;
import ru.mirea.gradebook.entities.Subject;
import ru.mirea.gradebook.services.SubjectService;

import java.util.List;

@RestController
public class SubjectRestController {
    private final SubjectService subjectService;

    public SubjectRestController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("subject/get")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @PostMapping("subject/add")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }

    @PutMapping("subject/update")
    public Subject updateSubject(@RequestBody Subject subject) {
        return subjectService.updateSubject(subject);
    }

    @DeleteMapping("subject/delete/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
    }

}
