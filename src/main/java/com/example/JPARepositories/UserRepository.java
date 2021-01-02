package com.example.JPARepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DataAccess.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
