package dev.changuii.project.controller;


import dev.changuii.project.dto.QuestionDTO;
import dev.changuii.project.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionController {


    private final QuestionService questionService;

    public QuestionController(
            @Autowired QuestionService questionService
    ){
        this.questionService=questionService;
    }


    @PostMapping()
    public ResponseEntity createQuestion(
            @RequestBody QuestionDTO questionDTO
            ){
        this.questionService.generateQuestion(questionDTO);
        return null;
    }


}