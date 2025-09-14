package stewie.springstart.course_api_data.course_api.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
	@Autowired
	private LessonRepository lessonRepository;
	
	public List<Lesson> getAllLessons(String courseId){
		List<Lesson> lessons = new ArrayList<>();
		lessonRepository.findAllByCourseId(courseId).forEach(lessons::add);
		return lessons;
	}
	
	public Optional<Lesson> getLesson(String id) {
		return lessonRepository.findById(id);
		
	}
	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}
	public void updateLesson(Lesson lesson) {
		lessonRepository.save(lesson);
	}
	public void deleteLesson(String id) {
		lessonRepository.deleteById(id);
	}
}
