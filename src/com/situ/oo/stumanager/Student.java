package com.situ.oo.stumanager;

public class Student {
	private String name;
	private int age;
	private char sex;

	public Student() {
	}

	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		if (sex == '女') {
			this.sex = sex;
		} else {
			this.sex = '男';
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 15 && age <= 35) {
			this.age = age;
		} else {
			this.age = 20;
		}
	}
}
