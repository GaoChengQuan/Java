package com.situ.basic;

import java.util.Scanner;

import org.junit.Test;

public class IfElse {

	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
			return;
		} 
		
		if (score >= 90) {
			System.out.println("优秀！");
		}
		if (score >= 80 && score < 90) {
			System.out.println("良好！");
		}
		if (score >= 70 && score < 80) {
			System.out.println("一般！");
		}
		if (score >= 60 && score < 70) {
			System.out.println("及格！");
		}
		if (score < 60) {
			System.out.println("不及格！");
		}
	}
	
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score >= 90) {
			System.out.println("优秀！");
		} else if (score >= 80) {
			System.out.println("良好！");
		} else if (score >= 70) {
			System.out.println("一般！");
		} else if (score >= 60) {
			System.out.println("及格！");
		} else if (score < 60) {
			System.out.println("不及格！");
		}
	}
}
