package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	List<Course> findByTopicId(String id);

	List <Course> findByName(String name);
	
	List <Course> findByDescription(String description);
	
}
