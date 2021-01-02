package com.example.DataAccess.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@Column(name="userid")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer userid;
	@Column(name="email")
	private String email;
	@ManyToOne
	@JoinColumn(name="taskid")
	private Task task;
	
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", task=" + task + "]";
	}
}
