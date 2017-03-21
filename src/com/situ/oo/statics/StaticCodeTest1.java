package com.situ.oo.statics;


class StaticCode1 {
	static {
		System.out.println("a");
	}
	
	public static void show() {
		System.out.println("show");
	}
}

public class StaticCodeTest1 {
	
	public static void main(String[] args) {
		StaticCode1 staticCode = null;
		staticCode = new StaticCode1();
		StaticCode1.show();
	}
}
