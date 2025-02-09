package Staticmethod;

public class Demo2 {
	
	public static void m1() {
		System.out.println("m1 method :: call directly");
	}
	
	public static void m2() {
		System.out.println("m2 method ::  by  using class name ");
	}
	public static void m3() {
		System.out.println("m3 method :: by using object name ");
	}
	
	public static void main(String[] args) {
		m1();
		Demo2.m2();
		Demo2 obj=new Demo2();
		obj.m3();
		
	}

}
