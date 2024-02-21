package com.tamil.college_service;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College{
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="studentName")
	private String studentName;
	
	@Column(name="Dateofbirth")
	private Date Dateofbirth;

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public Date getDateofbirth() {
		return Dateofbirth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setDateofbirth(Date dateofbirth) {
		Dateofbirth = dateofbirth;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String studentName, Date dateofbirth) {
		super();
		this.id = id;
		this.studentName = studentName;
		Dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", studentName=" + studentName + ", Dateofbirth=" + Dateofbirth + "]";
	}
	
}
	
	
	