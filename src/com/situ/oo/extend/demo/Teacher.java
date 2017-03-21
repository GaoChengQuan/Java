package com.situ.oo.extend.demo;

public class Teacher extends Person {

	/**
	 * 老师教授的专业
	 */
	String major;
	
	public void teach() {
		System.out.println("I can teach.");
	}
	
	/**
	 * 方法的覆盖
	 */
	public void show() {
		System.out.println(name + " " + age + " " + sex + " " + major);
	}
}
