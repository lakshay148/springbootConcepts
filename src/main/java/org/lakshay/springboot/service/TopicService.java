package org.lakshay.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.lakshay.springboot.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("1","Mathematics"),
			new Topic("2","English"),
			new Topic("3","Physics")));
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic input) {
		for(int i=0; i < topics.size(); i++) {
			Topic topic = topics.get(i);
			if(topic.getId().equals(id)) {
				topics.set(i, input);
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}
}
