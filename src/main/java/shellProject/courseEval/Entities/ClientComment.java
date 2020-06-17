package shellProject.courseEval.Entities;
import java.time.ZonedDateTime;

public class ClientComment {

    private int course;

    private String comment;

    private ZonedDateTime createDateTime;

    public ClientComment(int course, String comment, ZonedDateTime createDateTime) {
        this.course = course;
        this.comment = comment;
        this.createDateTime = createDateTime;
    }

    @Override
    public String toString() {
        return "ClientComment{" +
                "course=" + course +
                ", comment='" + comment + '\'' +
                ", createDateTime=" + createDateTime +
                '}';
    }
}
