package shellProject.courseEval;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseEvalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourseEvalApplication.class, args);
	}


	public void run(String... args) throws Exception {
		String action = args[0];

	}
}
