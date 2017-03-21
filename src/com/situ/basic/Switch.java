package com.situ.basic;

import java.util.Scanner;

import org.junit.Test;

/**
 * if-else适合做区间判断 switch适合做等值判断
 * 
 * @author Gao
 * 
 */
public class Switch {

	/**
	 * 输入1-4 1-奶茶 2-可乐 3-雪碧 4-冰红茶
	 */
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.println("奶茶");
		} else if (num == 2) {
			System.out.println("可乐");
		} else if (num == 3) {
			System.out.println("雪碧");
		} else if (num == 4) {
			System.out.println("冰红茶");
		} else {
			System.out.println("请输入1-4");
		}
	}

	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		// jdk1.8中String类型也可以
		switch (num) {
		case 1:
			System.out.println("牛奶");
			break;
		case 2:
			System.out.println("可乐");
			break;
		case 3:
			System.out.println("雪碧");
			break;
		case 4:
			System.out.println("冰红茶");
			break;
		default:
			System.out.println("请输入1-4");
			break;
		}
	}

	/**
	 * 将if-else判断成绩，改为switch判断成绩
	 */
	@Test
	public void test3() {
		/*
		 * Scanner scanner = new Scanner(System.in); int score =
		 * scanner.nextInt(); if (score > 100 || score < 0) {
		 * System.out.println("录入有误"); } else if (score >= 90) {
		 * System.out.println("优秀！"); } else if (score >= 80) {
		 * System.out.println("良好！"); } else if (score >= 70) {
		 * System.out.println("一般！"); } else if (score >= 60) {
		 * System.out.println("及格！"); } else if (score < 60) {
		 * System.out.println("不及格！"); }
		 */

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		int type = score / 10;
		if (score < 0 || score > 100) {
			System.out.println("录入有误");
		} else {
			switch (type) {
			case 10:
			case 9:
				System.out.println("优秀");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 7:
				System.out.println("一般");
				break;
			case 6:
				System.out.println("及格");
				break;
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("不及格");
				break;
			default:
				System.out.println("录入有误");
				break;
			}
		}
	}

	// 根据用于指定月份，打印该月份所属的季节。
	// 3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
	@Test
	public void test199() {
		int x = 4;

		if (x == 3 || x == 4 || x == 5) {
			System.out.println(x + "春季");
		} else if (x == 6 || x == 7 || x == 8) {
			System.out.println(x + "夏季");
		} else if (x == 9 || x == 10 || x == 11) {
			System.out.println(x + "秋季");
		} else if (x == 12 || x == 1 || x == 2) {
			System.out.println(x + "冬季");
		} else {
			System.out.println(x + "月份不存在");
		}

		if (x > 12 || x < 1) {
			System.out.println(x + "月份不存在");
		} else if (x >= 3 && x <= 5) {
			System.out.println(x + "春季");
		} else if (x >= 6 && x <= 8) {
			System.out.println(x + "夏季");
		} else if (x >= 9 && x <= 11) {
			System.out.println(x + "秋季");
		} else {
			System.out.println(x + "冬季");
		}
	}

	@Test
	public void test44() {
		int num1 = 4;
		int num2 = 3;
		char c = '+';
		switch (c) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			break;
		}
	}

	// 需求2：根据用于指定月份，打印该月份所属的季节。
	// 3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
	@Test
	public void test() {
		int x = 4;

		switch (x) {
		case 3:
		case 4:
		case 5:
			System.out.println(x + "春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(x + "夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(x + "秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(x + "冬季");
			break;
		default:
			System.out.println("nono");
			break;
		}
	}
}
