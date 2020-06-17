package shellProject.courseEval.repositories;

import org.springframework.data.repository.CrudRepository;
import shellProject.courseEval.Entities.Course;

import javax.persistence.Id;

public interface CourseRepository extends CrudRepository<Course, Id> {
    Course findByCourseNumber(int courseNumber);
}
