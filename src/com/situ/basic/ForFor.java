package com.situ.basic;

import org.junit.Test;

public class ForFor {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// *****
	// ****
	// ***
	// **
	// *
	@Test
	public void test() {
		int z = 5;
		for (int x = 0; x < 5; x++) { // x<5:因为外循环控制行数。一共5行。
			for (int y = 0; y < z; y++) {
				System.out.print("*");
			}
			System.out.println();
			z--;
		}

		System.out.println("-------------");

		for (int x = 0; x < 5; x++) { // x<5:因为外循环控制行数。一共5行。
			for (int y = 0; y < 5 - x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// ----*
	// ---* *
	// --* * *
	// -* * * *
	// * * * * *
	@Test
	public void test2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1; j++) { // 正三角
				// System.out.print("-");
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {// 倒三角，只是多了空格变成金字塔
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 1
	// 12
	// 123
	// 1234
	// 12345
	@Test
	public void test33() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
//	九九乘法表
//	1*1=1
//	1*2=2 2*2=4
//	1*3=3 2*3=6 3*3=9
@Test
public void test44() {
	for (int i = 1; i <= 9; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(j + "*" + i + "=" + i*j + "\t");
		}
		System.out.println();
	}
}

}
