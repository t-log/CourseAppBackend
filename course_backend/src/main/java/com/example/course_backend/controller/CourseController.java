package com.example.course_backend.controller;

import com.example.course_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String homePage(){return "Welcome to course home page";}

    @GetMapping("/view")
    public String viewPage(){return "Course view page";}

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addPage(@RequestBody Course c){
        System.out.println(c.getTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "course add page";}

}
