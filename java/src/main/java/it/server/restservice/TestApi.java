package it.server.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.server.model.Message;

@RestController
@RequestMapping("/messages")
public class TestApi {

	@Autowired
	private ApplicationConfiguration app;

	
	@GetMapping("")
	public List<Message> getMessages() {
		
		//Message msg2=new Message("lorenzo", "ciao");
		//app.addMessage(msg2);
		return app.getMessage();
	}
	
	@GetMapping("/add")
	public List<Message> addMessage(@RequestParam String name, @RequestParam String msg) {
		
		Message msg2=new Message(msg,name );
		app.addMessage(msg2);
		return app.getMessage();
	} 
	@GetMapping("/clear")
	public List<Message> resetMessages() {
		app.deleteMessges();
		Message msg2=new Message("reset","server" );
		app.addMessage(msg2);
		return app.getMessage();
	} 
}
