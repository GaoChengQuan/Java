package com.situ.oo.extend.demo;

import org.junit.Test;

public class Main {
	@Test
	public void test1() {
		Student student = new Student();
		student.name = "高";
		student.age = 30;
		student.sex = '男';
		student.no = "001";
		student.eat();
		student.study();
	}

	@Test
	public void test2() {
		Person person = new Student();
		person.name = "小明";
		person.age = 23;
		person.sex = '男';

		// //ClassCastException
		// Teacher teacher = (Teacher) person;
		// teacher.major = "Java";
		// teacher.show();

		if (person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			teacher.major = "Java";
			person.show();
			teacher.teach();
		} else if (person instanceof Student) {
			Student student = (Student) person;
			student.no = "001";
			person.show();
			student.study();
		}
	}
	
	@Test
	public void test3() {
		Student student = new Student();
		Teacher teacher = new Teacher();
		Person person = new Person();
	}
}
