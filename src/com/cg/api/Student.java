package com.cg.api;

public class Student {
	private int rollNum;
	private String studentName;
	private String studentAdd;
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAdd() {
		return studentAdd;
	}
	public void setStudentAdd(String studentAdd) {
		this.studentAdd = studentAdd;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", studentName=" + studentName + ", studentAdd=" + studentAdd + "]";
	}
	
	}
