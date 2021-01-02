package com.example.JPARepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DataAccess.Entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
}
