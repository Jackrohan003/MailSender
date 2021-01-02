package com.example.DataAccess;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.DataAccess.Entities.Task;
import com.example.JPARepositories.TaskRepository;

@Transactional
@Repository
public class TaskDAO {
	@Autowired
	TaskRepository repo;
	
	public void add(Task task)
	{
		repo.save(task);
	}
	
	public void update(Task task)
	{
		repo.save(task);
	}
}
