package com.situ.oo;

import org.junit.Test;

import com.situ.oo.Outer.Inner;


public class ClassTest {
	
	/**
	 * 内部类测试
	 */
	@Test
	public void testInnerClass() {
		Outer outer = new Outer();
		outer.show();
		
		// Outer.Inner inner1 = new Outer().new Inner();
		Outer.Inner inner = outer.new Inner();
		inner.show();
		int year = 0;
		if ((year % 4 == 0 && year % 100 != 0) 
				|| (year % 400 == 0)) {
			
		}
	}

}
