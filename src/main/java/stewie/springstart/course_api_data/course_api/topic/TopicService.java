package stewie.springstart.course_api_data.course_api.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.RequiredArgsConstructor;

@Service
//@Data
//@AllArgsConstructor
//@RequiredArgsConstructor
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
		public List<Topic> getAllTopics() {
			List<Topic> topics=new ArrayList<Topic>();
			topicRepository.findAll()
			.forEach(topics::add);
			return topics;
		}
		
		public Topic getTopic(String id) {
			return topicRepository.findById(id).orElseThrow(() -> new RuntimeException("Topic not found with id: " + id));
		}

		public void addTopic(Topic topic) {
			topicRepository.save(topic);
			
		}

		public void updateTopic(String id,Topic topic) {
			topicRepository.save(topic);
					
			}
			
		public void deleteTopic(String id) {
			topicRepository.deleteById(id);
		}
}
