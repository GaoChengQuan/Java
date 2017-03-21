package com.situ.basic;

import org.junit.Test;

public class StringTest {

	/**
	 * 基本类型
	 */
	@Test
	public void test1() {
		int zhang = 80;
		int li = zhang;
		System.out.println("第一次考试：");
		System.out.println("张同学的成绩:" + zhang);
		System.out.println("李同学的成绩:" + li);
		li = 90;
		System.out.println("第二次考试：");
		System.out.println("张同学的成绩:" + zhang);
		System.out.println("李同学的成绩:" + li);
	}
	
	/**
	 * 引用类型
	 */
	@Test
	public void test2() {
		int[] zhangs = {80, 90};
		int[] lis = zhangs;
		System.out.println("第一次考试：");
		System.out.println("张同学的成绩:" + zhangs[0] + " " + zhangs[1]);
		System.out.println("李同学的成绩:" + lis[0] + " " + lis[1]);
		lis[0] = 85;
		lis[1] = 95;
		System.out.println("第二次考试：");
		System.out.println("张同学的成绩:" + zhangs[0] + " " + zhangs[1]);
		System.out.println("李同学的成绩:" + lis[0] + " " + lis[1]);
	}
}
