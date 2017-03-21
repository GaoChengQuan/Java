package com.situ.oo.extend;

class Fu {
	int num = 4;
}

class Zi extends Fu {
	// int num = 5;
	void show() {
		System.out.println(num);//省略了this
		System.out.println(this.num);
		System.out.println(super.num);//调用父类的
	}
}

public class Extend {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}
