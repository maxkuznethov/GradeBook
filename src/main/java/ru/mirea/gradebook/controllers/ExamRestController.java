package ru.mirea.gradebook.controllers;

import org.springframework.web.bind.annotation.*;
import ru.mirea.gradebook.dto.ExamRequestDTO;
import ru.mirea.gradebook.dto.ExamResponseDTO;
import ru.mirea.gradebook.services.ExamService;

import java.util.List;
import java.util.Map;

@RestController
public class ExamRestController {
    private final ExamService examService;

    public ExamRestController(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping("exam/add")
    public ExamRequestDTO addExam(@RequestBody ExamRequestDTO examRequestDTO) {
        return examService.addExam(examRequestDTO);
    }

    @PutMapping("exam/changeMark/{id}")
    public ExamResponseDTO changeMark(@RequestBody Map<String, String> mark, @PathVariable Long id){
       return examService.changeMark(mark, id);
    }

    @GetMapping("exam/get/{id}")
    public List<ExamResponseDTO> getAllExams(@PathVariable Long id){
        return examService.getExams(id);
    }
}
