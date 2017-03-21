package com.situ.basic;

import org.junit.Test;

public class ArraySort {

	@Test
	public void bubbleSort1() {
		int[] nums = { 5, 3, 4, 2, 1 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 第一遍经过四次比较
		if (nums[0] > nums[1]) {
			int temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}
		if (nums[1] > nums[2]) {
			int temp = nums[1];
			nums[1] = nums[2];
			nums[2] = temp;
		}
		if (nums[2] > nums[3]) {
			int temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;
		}
		if (nums[3] > nums[4]) {
			int temp = nums[3];
			nums[3] = nums[4];
			nums[4] = temp;
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	@Test
	public void bubbleSort2() {
		int[] nums = { 5, 3, 4, 2, 1 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 第一遍经过四次比较,可以直接在一个for循环里面完成
		for (int j = 0; j < nums.length - 1; j++) {
			if (nums[j] > nums[j + 1]) {
				int temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
		}

		for (int j = 0; j < nums.length - 1 - 1; j++) {
			if (nums[j] > nums[j + 1]) {
				int temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
		}

		for (int j = 0; j < nums.length - 1 - 2; j++) {
			if (nums[j] > nums[j + 1]) {
				int temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
		}

		for (int j = 0; j < nums.length - 1 - 3; j++) {
			if (nums[j] > nums[j + 1]) {
				int temp = nums[j];
				nums[j] = nums[j + 1];
				nums[j + 1] = temp;
			}
		}

		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	@Test
	public void bubbleSort3() {
		int[] nums = { 5, 3, 4, 2, 1 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 第一遍经过四次比较,可以直接在一个for循环里面完成
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
}
