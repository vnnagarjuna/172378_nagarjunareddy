package com.rest.Rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.Rest.database.Database;
import com.rest.Rest.model.Message;

public class MessageService {
	
	private   Map <Long, Message> messages= Database.getMessages();
	
	public MessageService() {
		messages.put((long) 1, new Message(10,"hello","nag") );
		messages.put((long) 2, new Message(20,"hiii","nagarjuna"));
	}
	
  public  List <Message> getAllMessages(){
	return new ArrayList<Message>(messages.values());
  }
	 
	public Message addMessage(Message message)
	 {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	public Message updateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
			messages.put(message.getId(), message);
			return message;
	}
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
  }
