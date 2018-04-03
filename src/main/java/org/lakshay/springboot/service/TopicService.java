package org.lakshay.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.lakshay.springboot.model.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(new Topic("1","Mathematics"),
			new Topic("2","English"),
			new Topic("3","Physics"));
	
	public List<Topic> getTopics(){
		return topics;
	}

}
