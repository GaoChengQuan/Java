package com.situ.basic;

import org.junit.Test;

import sun.text.normalizer.IntTrie;

public class For1 {
	public static void main(String[] args) {
		for (int x = 0; x < 3; x++) {
			System.out.println("x=" + x);

		}
		// 会报错
		// System.out.println("x===="+x);

		int y = 0;
		while (y < 3) {
			System.out.println("y=" + y);
			y++;
		}
		System.out.println("y====" + y);
		
		int x = 1;
		for (System.out.print("a"); x < 3; System.out.print("c"), x++) {
			System.out.print("d");
			// x++;
		}
	}
	
	@Test
	public void test() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count=" + count);
	}
}
