package com.situ.oo;

/**
 * 内部类
 * 
 * @author Gao
 * 
 */
public class Outer {

	public void show() {
		System.out.println("外部类的show()");
	}

	public class Inner {
		public void show() {
			System.out.println("内部类的show()");
		}
	}
}
