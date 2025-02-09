package Polydemo;

public class Demo1 {
	
	public void m1() {
		System.out.println("m1 method with 0 args");
	}
	
	public void m1(int a) {
		System.out.println("m1 method with 1 int args"+a);
	}
	
	public void m1(String a) {
		System.out.println("m1 method with 1 String args"+a);
	}
	
	public void m1(int a, int b)
	{
		System.out.println("m1 method with 2 int args"+(a+b));
	}
	
	public void m1(String a, int b)
	{
		System.out.println("m1 method with 1 int and 1 String args"+(a+b));
	}

	public void m1(int a, String b)
	{
		System.out.println("m1 method with 1 int and 1 String args"+(a+b));
	}
	
	public static void main(String[] args) {
	
		Demo1 obj=new Demo1();
		obj.m1();
		obj.m1(100);
		obj.m1("selenium");
		obj.m1(10, 20);
		obj.m1(10, "selenium");
		obj.m1("java", 1000);
		
		
	}


}
