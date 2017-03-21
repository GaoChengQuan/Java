package com.situ.oo.extend.demo;

public class Student extends Person {

	/**
	 * 学号
	 */
	String no;
	
	public void study() {
		System.out.println("I can study.");
	}
	
	/**
	 * 方法的覆盖,覆盖父类的方法
	 */
	public void show() {
		System.out.println(name + " " + age + " " + sex + " " + no);
	}
}
