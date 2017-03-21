package com.situ.basic;

import org.junit.Test;

import com.sun.accessibility.internal.resources.accessibility;

public class JiBenLeiXing {
	@Test
	public void test() {
		byte b1 = 2; // -128 ~ 127
		// byte b2 = 128;

		float f = 2.3f;
		double d = 34.56;

		char ch1 = '4';
		char ch2 = 'a';
		char ch3 = '+';
		char ch4 = ' ';

		int a = 5;
		a = a + 3;

		byte b = 3;
		// b = b + 2;

		System.out.println('a');
		System.out.println('a' + 1);
		System.out.println((char) ('a' + 1));
		System.out.println((char) 98);
		System.out.println(('A' + 0));

		System.out.println('1' + 1);
	}
}
