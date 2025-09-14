package stewie.springstart.course_api_data.course_api.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson, String>{
		public List<Lesson> findAllByCourseId(String courseId);

}
