package com.situ.oo.interfac.demo1;

public class Main {

	public static void main(String[] args) {
		IInkBox inkBox = null;
		IPaper paper = null;
		// 定义打印机
		Printer printer = new Printer();
		// 使用黑白墨盒在A4纸上打印
		inkBox = new GrayInkBox();
		paper = new A4Paper();
		printer.print(inkBox, paper);
		// 使用彩色墨盒在B5纸上打印
		inkBox = new ColorInkBox();
		paper = new B5Paper();
		printer.print(inkBox, paper);
	}
}
