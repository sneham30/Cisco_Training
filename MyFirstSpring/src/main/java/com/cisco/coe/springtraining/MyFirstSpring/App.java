package com.cisco.coe.springtraining.MyFirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * My First Spring project
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/cisco/coe/springtraining/MyFirstSpring/beans.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		student.setAge(23);
		student.setMarks(77);
		System.out.println(student);

		Student student1 = (Student) context.getBean("student");
		System.out.println(student1);
		((ClassPathXmlApplicationContext) context).close();
	}
}
