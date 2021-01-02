package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DataAccess.TaskDAO;
import com.example.DataAccess.UserDAO;
import com.example.DataAccess.Entities.Task;
import com.example.DataAccess.Entities.User;
import com.example.RabbitQueue.Producer;
import com.example.Wrapper.Emails;

@Service
public class UserService {
	@Autowired
	TaskDAO t;
	@Autowired
	UserDAO d;
	@Autowired
	Producer queue;
	
	public void add(List<Emails> emails)
	{
		Task task = new Task();
		task.setStatus((byte)0);
		t.add(task);
		for(Emails email : emails)
		{
			User user = new User();
			user.setEmail(email.getEmail());
			user.setTask(task);		
			d.add(user);
			queue.addMessageToQueue(user.getEmail());
		}		
		task.setStatus((byte)1);
		t.update(task);
	}
}
