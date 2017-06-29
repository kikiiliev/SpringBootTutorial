package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		return (List<Topic>)topicRepository.findAll();
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
	
	public Topic getTopicByDescription(String description) {
		return topicRepository.findTopicByDescription(description);
	}
}
