package com.situ.basic;



public class ArrayTest3 {
	public static void main(String[] args) {
		//主要的问题：
		// 1、数组越界 
		int[] array1 = new int[]{1, 2};
		// System.out.println(array1[2]);
		//2、数组当做参数传递重新定义，没有使用的问题
		System.out.println(getSum(array1));
		
		int[] array2 = new int[]{1, 2, 78, 0};
		System.out.println(getMax(array2));
		
		System.out.println(getMin(array2));
		
		oddAndEvenCount();
		
		calNums1();
		calNums2();
	}
	
	//定义一个整型数组，写五个函数完成下面的功能	
	// 1、求出数组元素的和
	private static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	// 2、数组元素的最大值
	public static int getMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int getMax2(int[] array) {
		// 当前最大的值的下标
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[maxIndex] < array[i]) {
				maxIndex = i;
			}
		}
		return array[maxIndex];
	}
	
	// 3、数组元素的最小值
	/**
	 * 数组元素的最小值
	 * @param array
	 * @return
	 */
	public static int getMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	// 4、并输出所求的结果。
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	// 5、要求求出其中的奇数个数和偶数个数。
	public static void oddAndEvenCount() {
		int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				evenCount = evenCount + 1;
			} else {
				oddCount = oddCount + 1;
			}
		}
		System.out.println("偶数：" + evenCount);
		System.out.println("奇数：" + oddCount);
	}
	
	// int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9}; 
	// 求出上面数组中0-9分别出现的次数
	public static void calNums1() {
		int[] score = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9}; 
		int num0 = 0;
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				num0 = num0 + 1;
				break;

			default:
				break;
			}
		}
		System.out.println("0的次数： " + num0);
	}
	
	public static void calNums2() {
		int[] score = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9}; 
		int[] numCountArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				numCountArray[0] = numCountArray[0] + 1;
				break;
			default:
				break;
			}
		}
		for (int i = 0; i < numCountArray.length; i++) {
			System.out.println(i + "的次数： " + numCountArray[i]);
		}
	}
}