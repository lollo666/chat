package it.server.model;

import java.util.ArrayList;
import java.util.List;


public class Messages {
	List<Message> msgList= new ArrayList<Message>();
	
	public Messages(Message msg) {
		super();
		this.addMessage(msg);
	}
	public Messages() {
		super();
	}
	public List<Message> getMessage(){
		return this.msgList;
	}
	 public void addMessage(Message msg) {
		 this.msgList.add(msg);
	 }
	
}
