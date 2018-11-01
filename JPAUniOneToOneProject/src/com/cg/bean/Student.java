package com.cg.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Students")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roll_no", length=10)
	private int rollNo;
	
	@Column(name="stud_name", length=25)
	private String studName;
	
	@Transient
	private int studMarks;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="add_id")
	private Address stuAdd;
	
	public Address getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(Address stuAdd) {
		this.stuAdd = stuAdd;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	public String getStudName()
	{
		return studName;
	}
	public void setStudName(String studName) 
	{
		this.studName = studName;
	}
	public int getStudMarks() 
	{
		return studMarks;
	}
	public void setStudMarks(int studMarks) 
	{
		this.studMarks = studMarks;
	}
	


	public Student(int rollNo, String studName, int studMarks, Address stuAdd) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.studMarks = studMarks;
		this.stuAdd = stuAdd;
	}
	public Student() {
		super();
	
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName
				+ ", studMarks=" + studMarks + ", stuAdd=" + stuAdd + "]";
	}
	
	
	
	
}
