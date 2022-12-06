package com.example.course_backend.dao;

import com.example.course_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {

}
