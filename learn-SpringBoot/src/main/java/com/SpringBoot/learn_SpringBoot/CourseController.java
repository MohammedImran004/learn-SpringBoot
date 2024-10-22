package com.SpringBoot.learn_SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
    return Arrays.asList(
    new Course(1, "Spring Boot"),
    new Course(2, "Spring Cloud"),
    new Course(3, "Spring Data"));
    }
}
