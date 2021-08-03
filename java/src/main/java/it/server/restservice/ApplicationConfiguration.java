package it.server.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import it.server.model.Message;

@Component
@ConfigurationProperties("basic")
public class ApplicationConfiguration {
	
	
	public ApplicationConfiguration() {
	
			
			Message msg2=new Message("start","Server");
			this.addMessage(msg2);
		
	}
	List<Message> msgList= new ArrayList<Message>();
	
	public List<Message> getMessage(){
		return this.msgList;
	}
	 public void addMessage(Message msg) {
		 this.msgList.add(msg);
	}
	public void deleteMessges() {
		this.msgList.clear();
	}
	
}
