package com.restapi77entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "School_Information")
public class SchoolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "School Id")
	private int id;
	@Column(name = "SchoolName")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkT")
	private Teacher teacher;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkS")
	private Student student;
	public SchoolEntity() {
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
