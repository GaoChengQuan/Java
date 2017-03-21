package com.situ.basic;

import org.junit.Test;

public class MethodTest {

	@Test
	public void test1() {
		doSum();
		doSumEnd(50);
		doSumBegin(10);
		doSumBeginEnd(10, 50);
		
		// 函数可以有返回值
		double num = Math.random();
		// 先计算工资，再加上奖金
		int[] moneys = {2000, 3000, 4000, 5000, 5000, 7000, 7000, 9000};
		int sum = sum(moneys);
		sum += 8000;//加上奖金
		System.out.println(sum);
	}

	private int sum(int[] moneys) {
		int sum = 0;
		for (int i = 0; i < moneys.length; i++) {
			sum += moneys[i];
		}
		return sum;
	}

	private void doSumBeginEnd(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	private void doSumBegin(int begin) {
		int sum = 0;
		for (int i = begin; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

	private void doSumEnd(int end) {
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	private void doSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
