package org.lakshay.springboot.controller;

import java.util.List;

import org.lakshay.springboot.model.Topic;
import org.lakshay.springboot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/getTopics")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping("/getTopic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addTopic")
	public void getTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateTopic/{id}")
	public void updateTopic(@PathVariable String id,@RequestBody Topic topic) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(value="/deletTopic/{id}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
