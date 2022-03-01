package com.example.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
	 private String nameorder;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameorder() {
		return nameorder;
	}
	public void setNameorder(String nameorder) {
		this.nameorder = nameorder;
	}

}
