package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> allTopics = new ArrayList<>();
		Topic topic1 = new Topic("spring", "Spring Framework", "Spring Framework Description");
		Topic topic2 = new Topic("java", "Core Java", "Core Java Description");
		Topic topic3 = new Topic("javascript", "JavaScript", "JavaScript Description");
		
		/*
		 *  Alternatively  this was used in the course and seems better...  
		 *  Admittedly haven't thought of it before
		 
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description")
				);
		*/
		
		allTopics.add(topic1);
		allTopics.add(topic2);
		allTopics.add(topic3);
		return allTopics;
	}

}
