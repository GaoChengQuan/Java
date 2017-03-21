package com.situ.oo.statics;

class Person {
String name;//成员变量，实例变量
static String country = "CN";//静态的成员变量，类变量
	
	public void show() {
		System.out.println(name + " : " + country);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "zhangsan";
		person.show();
		System.out.println(person.country);;
		System.out.println(Person.country);
		
	}
}
