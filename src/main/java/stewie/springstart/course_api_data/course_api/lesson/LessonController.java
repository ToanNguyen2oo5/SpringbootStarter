package stewie.springstart.course_api_data.course_api.lesson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import stewie.springstart.course_api_data.course_api.course.Course;

@RestController
@RequestMapping("/topics/{topicId}")
public class LessonController {
	
	@Autowired
	private LessonService lessonService;
	
	@GetMapping("/courses/{id}/lessons")
	public List<Lesson> getAllLessons(@PathVariable String id){
		return lessonService.getAllLessons(id);
	}
	@GetMapping("/courses/{courseId}/lessons/{id}")
	public Optional<Lesson> getLesson(@PathVariable String id) {
		return lessonService.getLesson(id);
	}
	@PostMapping("/courses/{courseId}/lessons")
	public void addLesson(@RequestBody Lesson lesson,@PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"",""));
		lessonService.addLesson(lesson);
	}
	@PutMapping("/courses/{courseId}/lessons/{id}")
	public void updateLesson(@RequestBody Lesson lesson,@PathVariable String courseId,@PathVariable String id) {
		lesson.setCourse(new Course(courseId,"",""));
		lessonService.updateLesson(lesson);
	}
	@DeleteMapping("/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id){
		lessonService.deleteLesson(id);
	}
}
