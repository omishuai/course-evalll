package shellProject.courseEval.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import shellProject.courseEval.Entities.Comment;

import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

public interface CommentRepository extends CrudRepository<Comment, Id> {

    @Query("select new shellProject.courseEval.Entities.ClientComment(" +
            "course.courseNumber, " +
            "comment.comment, " +
            "comment.createDateTime) " +
            "From Comment comment  left join comment.course course " +
            "WHERE course.courseNumber = :course")
    List<Comment> findByCourseOrderByCreateDateTime(int course, Pageable pageable);

}
