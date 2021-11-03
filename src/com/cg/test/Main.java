package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.DAO.StudentDaoImpl;
import com.cg.api.Student;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		StudentDaoImpl newStudent= context.getBean("studentDao",StudentDaoImpl.class);
		student1.setRollNum(3);
		student1.setStudentName("renu");
		student1.setStudentAdd("HYB");
		
		//StudentDao newStudent = new StudentDaoImpl();
		
		newStudent.insert(student1);

	}

}
