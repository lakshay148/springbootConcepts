package org.lakshay.springboot.controller;

import java.util.List;

import org.lakshay.springboot.model.Topic;
import org.lakshay.springboot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getTopics")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
}
