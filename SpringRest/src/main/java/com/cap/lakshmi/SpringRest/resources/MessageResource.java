package com.cap.lakshmi.SpringRest.resources;



import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cap.lakshmi.SpringRest.model.Message;
import com.cap.lakshmi.SpringRest.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	
	MessageService messageService=new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages()
	{
		
		return messageService.getAllMessages();
		
	}
}
