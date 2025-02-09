package Polydemo;

public class Demo3 {

	
	void m1() {
		System.out.println("0 args");
	}

	void m1(int a, long b) {
		System.out.println("1 int and 1 Long args");
	}

	void m1(String a, float b) {
		System.out.println("1 String and 1 float");
	}

	void m1(String a, String b) {
		System.out.println("2 String args");
	}

	void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] args) {

		Demo3 obj= new Demo3();
		obj.m1();
		obj.m1(10, 300200);
		obj.m1("sele", 235);
		obj.m1("selenium", "selenium");
		obj.m1("selenium", "selenium");
		obj.m2();
		
	}

}

