package com.situ.oo.stumanager;

import java.util.Scanner;

/**
 * 学生管理系统
 * @author Gao
 *
 */
public class StudentManager {
	public static void main(String[] args) {
		System.out.println("=====学生管理系统======");
		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[2];
		// 录入所有的学生
		for (int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.println("请输入第" + (i+1) + "个学生的姓名：");
			String name = scanner.next();
			student.setName(name);
			System.out.println("请输入第" + (i+1) + "个学生的性别：");
			char sex = scanner.next().charAt(0);// 得到字符串的某个字符
			student.setSex(sex);
			System.out.println("请输入第" + (i+1) + "个学生的年龄：");
			int age = scanner.nextInt();
			student.setAge(age);
			
			students[i] = student;
		}
		
		// 展示所有学生
		System.out.println("展示所有学生信息：");
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i].getName() + " ");
			System.out.print(students[i].getSex() + " ");
			System.out.print(students[i].getAge() + " ");
			System.out.println();
		}
		
		// 根据条件查询学生信息：
		while (true) {
			System.out.println("根据条件查询学生信息：");
			System.out.println("根据姓名输入：1");
			System.out.println("根据年龄输入：2");
			System.out.println("根据性别输入：3");
			System.out.println("退出：0");
			
			int type = scanner.nextInt();
			
			if (type == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (type) {
			case 1:
				System.out.println("请输入要查询的姓名：");
				String name = scanner.next();
				boolean isFoundByName = false;
				for (int i = 0; i < students.length; i++) {
					if (name.equalsIgnoreCase(students[i].getName())) {
						System.out.println(students[i].getName() + " ");
						System.out.println(students[i].getAge() + " ");
						System.out.println(students[i].getSex() + " ");
						isFoundByName = true;
					}
				}
				if (!isFoundByName) {
					System.out.println("沒有找到对应的数据。");
				}
				break;
			case 2:
				System.out.println("请输入要查询的姓名：");
				int age = scanner.nextInt();
				boolean isFoundByAge = false;
				for (int i = 0; i < students.length; i++) {
					if (age == students[i].getAge()) {
						System.out.println(students[i].getName() + " ");
						System.out.println(students[i].getAge() + " ");
						System.out.println(students[i].getSex() + " ");
						isFoundByName = true;
					}
				}
				if (!isFoundByAge) {
					System.out.println("沒有找到对应的数据。");
				}
				break;
			case 3:
				System.out.println("请输入要查询的性别：");
				char sex = scanner.next().charAt(0);
				boolean isFoundBySex = false;
				for (int i = 0; i < students.length; i++) {
					if (sex == students[i].getSex()) {
						System.out.println(students[i].getName() + " ");
						System.out.println(students[i].getAge() + " ");
						System.out.println(students[i].getSex() + " ");
						isFoundByName = true;
					}
				}
				if (!isFoundBySex) {
					System.out.println("沒有找到对应的数据。");
				}
				break;
			default:
				System.out.println("请输入1、2、3、 0");
				break;
			}
		}
	}
}
