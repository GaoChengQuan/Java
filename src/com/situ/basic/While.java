package com.situ.basic;

import org.junit.Test;

public class While {
	/**
	 * 输出5遍Hello world.
	 */
	@Test
	public void test1() {
		int i = 0;
		while (i < 5) {
			System.out.println("Hello world!");
			i = i + 1;//变化的一定是放在循环体里面的，而且是不断趋向循环条件
			// 这里可以讲解一下 i+=1 i++
		}
	}
	
	/**
	 * 高斯
	 * 1+2+3+...+100=5050
	 * 结果如果是5050就是正确的
	 */
	@Test
	public void test2() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
	
}
