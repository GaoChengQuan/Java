package com.situ.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class CollectionTest {

	/**
	 * 用数组实现的特点是数组大小必须刚开始就初始化好
	 * 由此引入了List
	 */
	@Test
	public void test1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的个数");
		int count = scanner.nextInt();
		String[] names = new String[count];
		for (int i = 0; i < names.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的姓名：");
			names[i] = scanner.next();
		}
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}
	}
	
	/**
	 * List可以放任意元素个数
	 */
	@Test
	public void test2() {
		// 这里也是一个多态
		List list = new ArrayList();
		System.out.println(list.size());
		list.add("小明");
		list.add("小张");
		list.add("小红");
		System.out.println(list.size());
		
		String name = (String) list.get(0);
		// 如果不想加强制类型转换需要用到泛型，像数组一样存储的类型是事先定义好的
		// int[]   String[]
		
		List<String> strList = new ArrayList<String>();
		strList.add("高");
		// strList.add(1);
		
		// List<int> list1= new ArrayList<int>();
		// List中存放的泛型类型必须是包装类型
		
		// 将字符串转换成整数
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(str + 5);
	}
}
