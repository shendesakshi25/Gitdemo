package Staticmethod;

public class Demo3 {
	
	public static void m1() {
		System.out.println("m1 method");
	}
	
	public static void m2(int a, int b, String c) {
		System.out.println(a+b+c);//30seleniu
		System.out.println(c+a+b);//selenium1020
	}

	public static void main(String[] args) {
		m1();
		m2(10,20,"selenium");
	}

}
