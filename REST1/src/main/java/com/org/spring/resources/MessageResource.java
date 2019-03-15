package com.org.spring.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.org.spring.resources.model.Message;
import com.org.spring.resources.services.MessageService;

@Path("/message")
public class MessageResource {
	
	
	MessageService messageService=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}

	
}
