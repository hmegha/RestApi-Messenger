package org.himanshu.javabrains.messenger2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.himanshu.javabrains.messenger2.Database.DatabaseClass;
import org.himanshu.javabrains.messenger2.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages=DatabaseClass.getMessages();
	
	
	
	public MessageService()
	{
		
		messages.put(1L,new Message(22,"Hello","Himanshu"));
		messages.put(2L,new Message(23,"Love You","Shree"));
		
	}

	/*public List<Message> getAllMessages()
	{
		Message m1=new Message(1L,"Hello","Himanshu");
		Message m2=new Message(2L,"Hello","Meghashree");
		List<Message> list=new ArrayList(); 
		list.add(m1);
		list.add(m2);
		return list;
		
	}
	*/
	
	
	public List<Message> getAllMessages()
	{
		
		return new ArrayList<Message>(messages.values());
	}
	
	
	public Message getMessage(long id)
	{
		return messages.get(id);
		
	}
	
	public Message addMessage(Message message)
	{		
		message.setId(messages.size() + 1);
		messages.put(message.getId(),message);
		return message;		
		
	}
	
	public Message updateMessage(Message message)
	{
		
		if(message.getId()<=0)
			return null;
		
		messages.put(message.getId(), message);
		
		return message;
	}
	
	public Message removeMessage(Long id)
	{
		return messages.remove(id);
		
	}
	
	
}




