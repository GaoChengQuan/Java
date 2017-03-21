package com.situ.oo.extend;

class Person {
	void study() {
		System.out.println("VB");
	}
}

class Student extends Person {
	void study() {
		System.out.println("Java");
	}
}

class Teacher extends Person {
	void study() {
		System.out.println("C++");
	}
}

public class Extend1 {
	public static void main(String[] args) {
		Student student = new Student();
		student.study();
		Teacher teacher = new Teacher();
		teacher.study();
		
		Person stuPerson = new Student();
		stuPerson.study();
		Person teacherPerson = new Teacher();
		teacherPerson.study();
	}
}
