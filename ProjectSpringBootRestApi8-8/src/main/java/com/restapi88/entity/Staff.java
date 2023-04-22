package com.restapi88.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "staff_Id")
	private int id;
@Column(name = "staff_name")
    private String  staffname;
@Column(name = "staff_post")
    private String staffPost;
public Staff() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStaffname() {
	return staffname;
}
public void setStaffname(String staffname) {
	this.staffname = staffname;
}
public String getStaffPost() {
	return staffPost;
}
public void setStaffPost(String staffPost) {
	this.staffPost = staffPost;
}


}
