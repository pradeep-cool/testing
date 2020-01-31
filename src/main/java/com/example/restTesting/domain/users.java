package com.example.restTesting.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User1") // this field is not require if the table name and the class names are same
public class users {
	
	 @Id //primary key
	 @GeneratedValue(strategy=GenerationType.IDENTITY) // this annotation is used to create a dynamic values starting from '1'
	    private int id;

	 @Column(name = "name", nullable = false) // this annotation is used to define the column name
	 private String name;

	public users(int id, String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public users() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "users [id=" + id + ", name=" + name + "]";
	}
	 
	
}
