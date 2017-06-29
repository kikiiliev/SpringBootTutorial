package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	public List<Course> getAllCourses(String id) {
		return (List<Course>)courseRepository.findByTopicId(id);
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
}
