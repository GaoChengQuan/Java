package com.situ.oo.extend.demo;

public abstract class Person {
	String name;
	int age;
	char sex;
	
	public void eat() {
		System.out.println("I can eat.");
	}
	
//	public void show() {
//		System.out.println(name + " " + age + " " + sex);
//	}
	
	public abstract void show();
}
