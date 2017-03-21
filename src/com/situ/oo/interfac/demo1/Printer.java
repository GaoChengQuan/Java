package com.situ.oo.interfac.demo1;

public class Printer {

	public void print(IInkBox inkBox, IPaper paper) {
		System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize()
				+ "纸上打印信息");
	}
	
public void print(ColorInkBox inkBox, A4Paper paper) {
	System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize()
			+ "纸上打印信息");
}

public void print(GrayInkBox inkBox, A4Paper paper) {
	System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize()
			+ "纸上打印信息");
}

public void print(ColorInkBox inkBox, B5Paper paper) {
	System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize()
			+ "纸上打印信息");
}

public void print(GrayInkBox inkBox, B5Paper paper) {
	System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize()
			+ "纸上打印信息");
}
}
