package com.example.DataAccess;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.DataAccess.Entities.User;
import com.example.JPARepositories.UserRepository;

@Transactional
@Repository
public class UserDAO {

	@Autowired
	UserRepository repo;
	
	public void add(User user)
	{
		repo.save(user);
	}

}
