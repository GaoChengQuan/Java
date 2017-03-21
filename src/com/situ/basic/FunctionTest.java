package com.situ.basic;

import org.junit.Test;

public class FunctionTest {

	public static void main(String[] args) {
		sum(3, 4);
		// The method println(boolean) in the type PrintStream is not applicable
		// for the arguments (void)
		// System.out.println(sum(3, 4));
	}

	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	@Test
	public void test() {
		// 想知道任意一个数*3+5后的结果
		int x = 4;
		System.out.println(x * 3 + 5);

		int y = 6;
		System.out.println(y * 3 + 5);

		int result1 = getResult(4);
		System.out.println(result1);
		int result2 = getResult(6);
		System.out.println(result2);
	}

	private int getResult(int num) {
		return num * 3 + 5;
	}

	public static int getSum() {
		return 3 + 4;
	}

	public static int getSum(int x, int y) {
		return x + y;
	}

	/*
	 * 需求：判断两个数是否相同。 思路： 1，明确功能的结果：结果是：boolean 。 2，功能是否有未知内容参与运算。有，两个整数。
	 */
	public static boolean compare(int a, int b) {

		// if(a==b) {
		// return true;
		// } else {
		// return false;
		// }

		// return (a==b)?true:false;

		return a == b;
	}

	/*
	 * 需求：定义功能，对两个数进行比较。获取较大的数。
	 */
	public static int getMax(int a, int b) {
		// if(a>b) {
		// return a;
		// } else {
		// return b;
		// }

		return (a > b) ? a : b;
	}
}
