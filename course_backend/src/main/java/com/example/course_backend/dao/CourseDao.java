package com.example.course_backend.dao;

import com.example.course_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {
    @Query(value = "SELECT `id`, `date`, `description`, `duration`, `title`, `venue` FROM `course_db` WHERE `title`=:title",nativeQuery = true)
    List<Course> searchCourse(@Param("title") String title);
}
