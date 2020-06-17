package shellProject.courseEval.services;

import org.springframework.beans.factory.annotation.Autowired;
import shellProject.courseEval.Entities.Course;
import shellProject.courseEval.repositories.CourseRepository;

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    void addCourse(Course course) {
        Course exists = courseRepository.findByCourseNumber(course.getCourseNumber());
        if (exists == null) {
            courseRepository.save(course);
        }
    }

    Course getCourseByCourseNumber(int courseNumber) {
        return courseRepository.findByCourseNumber(courseNumber);
    }
}
