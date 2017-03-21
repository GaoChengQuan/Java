package com.situ.basic;

import org.junit.Test;

public class For2 {

	@Test
	public void test1() {
		int i = 0;
		while (i < 5) {
			System.out.println("Hello World!");
			i++;
		}
		
		// for循环就是对while循环的整理，将控制语句放在了一起，方法体只有逻辑语句。
		for (int j = 0; j < 5; j++) {
			System.out.println("Hello World!");
		}
		
		// for循环的三个表达式都是可以省略掉的
		int k = 0;
		for (;k < 5; k++) {
			System.out.println("Hello World!");
		}
		//死循环
		for (;;) {
			System.out.println("Hello World!");
		}
	}
	
	/**
	 * 二重循环
	 * 直角三角形
	 * 
	 */
	@Test
	public void test2() {
		// 注意外层循环控制什么，内层循环控制什么
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		*
//		**
//		***
//		****
//		*****
	}
	
	/**
	 * 九九乘法表
	 */
	@Test
	public void test3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
