package com.situ.basic;

import java.util.Scanner;

import org.junit.Test;

public class ArrayTest {
	@Test
	public void test() {
		int[] nums1 = { 3, 5, 6, 7 };// 边定义边赋值
		int[] nums2 = new int[4];
		nums2[0] = 3;
		nums2[1] = 5;
		nums2[2] = 6;
		nums2[3] = 7;
	}

	@Test
	public void test1() {
		int[] scores = new int[5];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		scores[3] = 60;
		scores[4] = 90;
		// int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		// int avg = sum / 5;
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println(avg);
	}

	/**
	 * 上面的平均分数据根据控制台输入
	 */
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请录入班级人数：");
		int num = scanner.nextInt();
		int[] scores = new int[num];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请录入第" + (i + 1) + "个学生的成绩:");
			scores[i] = scanner.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println(scores.length + "个学生的平均分时：" + avg);
	}

	@Test
	public void test88() {
		int[] arr1 = new int[] { 3, 1, 6, 5, 4 };
		printArray(arr1);
		
//		int[] arr2 = { 3, 1, 6, 5, 4 };
//		int[] arr3 = new int[5];
//		arr3[0] = 3;
//		arr3[1] = 1;
//		System.out.println(arr3[5]);
//		arr3 = null;
//		System.out.println(arr3[1]);
	}

	/**
	 * 定义功能，用于打印数组中的元素。元素间用逗号隔开。
	 * 
	 * @param arr
	 */
	public void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1) {
				System.out.print(arr[x] + ", ");
			} else {
				System.out.println(arr[x] + "]");
			}
		}
	}

}