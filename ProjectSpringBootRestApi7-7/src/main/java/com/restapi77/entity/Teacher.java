package com.restapi77.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherInfo")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TeacherId")
	private int id;
	@Column(name = "TecherName")
	private String name;
	@Column(name = "SubjectTeacher")
	private String subject;
	@Column(name = "sallary")
	private float sallary;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getSallary() {
		return sallary;
	}
	public void setSallary(float sallary) {
		this.sallary = sallary;
	}
	
	

}
