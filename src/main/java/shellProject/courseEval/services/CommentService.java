package shellProject.courseEval.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import shellProject.courseEval.Entities.Comment;
import shellProject.courseEval.Entities.Course;
import shellProject.courseEval.repositories.CommentRepository;

import java.util.List;

public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    CourseService courseService;

    public List<Comment> getCommentsByCourseByTime(int course, int limit) {
        return commentRepository.findByCourseOrderByCreateDateTime(course, PageRequest.of(0, limit, Sort.by("createDateTime").descending()));
    }

    public void addComment(String commentText, int courseNumber) {
        Course course = courseService.getCourseByCourseNumber(courseNumber);
        Comment comment  = new Comment(course, commentText);
        commentRepository.save(comment);
    }
}
