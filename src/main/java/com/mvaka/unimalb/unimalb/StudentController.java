package com.mvaka.unimalb.unimalb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private  final SudentService sudentService;
    @Autowired
    public StudentController(SudentService sudentService) {
        this.sudentService = sudentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return  SudentService.getStudents();
    }
}
