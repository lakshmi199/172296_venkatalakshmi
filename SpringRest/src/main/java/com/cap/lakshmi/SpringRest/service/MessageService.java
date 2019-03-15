package com.cap.lakshmi.SpringRest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cap.lakshmi.SpringRest.model.Message;

public class MessageService {
public List<Message> getAllMessages(){
	Message m1=new Message(1l, "hello",new Date(), "lakshmi");
	Message m2=new Message(2l, "hey",new Date(), "sai");
	List<Message> list=new ArrayList<Message>();
	list.add(m1);
	list.add(m2);
	return list;
}
}
