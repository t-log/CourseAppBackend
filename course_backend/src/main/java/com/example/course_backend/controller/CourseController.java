package com.example.course_backend.controller;

import com.example.course_backend.dao.CourseDao;
import com.example.course_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String homePage(){return "Welcome to course home page";}

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> viewPage()
    {
        return (List<Course>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addPage(@RequestBody Course c){
//        System.out.println(c.getTitle());
//        System.out.println(c.getDescription());
//        System.out.println(c.getVenue());
//        System.out.println(c.getDuration());
//        System.out.println(c.getDate());
        dao.save(c);
        return "{\"status\":\"success\"}";
    }

}
