package com.example.DataAccess.Entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="task")
public class Task {
	@Id
	@Column(name="taskid")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer taskId;
	@Column(name="status")
	private Byte status;
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "task")
	private Set<User> users;
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public User addUsers(User item) {
		getUsers().add(item);
		item.setTask(this);

		return item;
	}

	public User removeItem(User user) {
		getUsers().remove(user);
		user.setTask(null);

		return user;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", status=" + status + ", users=" + users + "]";
	}
}