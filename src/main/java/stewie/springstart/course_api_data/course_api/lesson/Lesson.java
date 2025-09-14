package stewie.springstart.course_api_data.course_api.lesson;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import stewie.springstart.course_api_data.course_api.course.Course;

@Entity
public class Lesson {
	@Id
	public String id;
	public String name;
	public String description;
	
	@ManyToOne
	private Course course;
	
	public Lesson() {
		
	}
	public Lesson(Course course) {
		this.course = course;
	}
	public Lesson(String id, String name, String description, String courseId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.course = new Course(courseId,"","");
	}

	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Lesson(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
