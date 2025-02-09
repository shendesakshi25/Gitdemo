package Nonstaticmethod;

public class Demo2 {

	//non static method with int return type and 0 args/parameter
	
		public int m1() {
			int a=100;
			int b=200;
			int c=a+b;
			return c;
		}
		
		public void m2() {
			System.out.println("m2 method");
		}
		
		public static void main(String[] args) {
			Demo2 obj=new Demo2();
			int abc=obj.m1();
			System.out.println(abc);
			obj.m2();
		
		}
}
