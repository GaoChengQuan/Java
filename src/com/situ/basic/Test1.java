package com.situ.basic;

import java.util.Scanner;

import org.junit.Test;

public class Test1 {

//	质数是只能被1和它本身整除的数,如
//	2,3,5,7,11,13,17,19,23,29,31
//	合数是除了质素和1的数,如
//	4,6,8,9,10,12,14,15,16,
	/**
	 * 输入一个数判断是质数还是合数
	 */
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + "是合数");
				break;
			} else {
				System.out.println(num + "是质数");
			}
		}
		// 输入9是错误的
	}
	
	/**
	 * 输入一个数判断是质数还是合数
	 */
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		boolean isPrime = true;//默认是质数
		if (num == 1) {
			System.out.println(num + "即使不是质数也不是合数");
			return;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "是质数");
		} else {
			System.out.println(num + "是合数");
		}
		// 如果状态只有两种适合设置boolean类型的变量
	}
	
	/**
	 * 输入一个数判断是质数还是合数
	 */
	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = scanner.nextInt();
		boolean isPrime = true;//默认是质数
		if (num == 1) {
			System.out.println(num + "即使不是质数也不是合数");
			return;
		}
		// 提高效率的方式
		// 例如10/5=2,10/6=1.xx，5之后都是1点几都不是整数
//		for (int i = 2; i <= num/2; i++) {
//			if (num % i == 0) {
//				isPrime = false;
//				break;
//			}
//		}
		//又有人推理出<=Math.sqrt(num)就可以了
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "是质数");
		} else {
			System.out.println(num + "是合数");
		}
		// 如果状态只有两种适合设置boolean类型的变量
	}
	
	/**
	 * 输入一个数判断是质数还是合数
	 * 判断100以内的质数和合数
	 */
	@Test
	public void test4() {
		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;// 默认是质数
			// 又有人推理出<=Math.sqrt(num)就可以了
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + "是质数");
			} else {
				System.out.println(num + "是合数");
			}
		}

	}
}
