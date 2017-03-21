package com.situ.oo;

/**
 * Constructor
 * 
 * @author Gao
 * 
 */
class Person {
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public Person(String name, int age) {
		// this.name = name;
		this(name);
		this.age = age;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("gao");
		Person p2 = new Person("li", 23);
	}
}
