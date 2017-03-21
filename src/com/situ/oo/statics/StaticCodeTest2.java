package com.situ.oo.statics;


class StaticCode2 {
	StaticCode2() {
		System.out.println("b");
	}
	
	static {
		System.out.println("a");
	}
	
	{
		System.out.println("c");
	}
	
	StaticCode2(int x) {
		System.out.println("d");
	}
}

public class StaticCodeTest2 {
	
	public static void main(String[] args) {
		new StaticCode2(3);
	}
}
 