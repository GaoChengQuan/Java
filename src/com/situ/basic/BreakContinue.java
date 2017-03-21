package com.situ.basic;

import org.junit.Test;

public class BreakContinue {

	@Test
	public void breakTest1() {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void breakTest2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3) {
					break;
				}
				System.out.println(i);
			}
		}
		// break控制的是内层循环
	}
	
	@Test
	public void breakTest3() {
		w: for (int i = 0; i < 5; i++) {
			q: for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break w;
				}
				System.out.println(i);
			}
		}
		System.out.println("over");
		// break控制的是内层循环
	}

	@Test
	public void continueTest1() {
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void continueTest2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 3) {
					continue;
				}
				System.out.println(i);
			}
		}
		// continue控制的是内层循环
	}
}
