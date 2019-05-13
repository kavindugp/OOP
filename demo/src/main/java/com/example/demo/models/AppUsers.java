package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appUsers")
public class AppUsers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	@Column(name = "fname")
	String fname;
	
	@Column(name = "lname")
	String lname;
	
	@Column(name = "age")
	int age;
	
	@Column(name = "nic")
	String nic;
	
	@Column(name = "phone")
	String phone;
	
	
	
	public AppUsers() {
		
	}
	
	
	
	public AppUsers(String fname, String lname, int age, String nic, String phone) {
		
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.nic = nic;
		this.phone = phone;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
