package Nonstaticmethod;

public class Demo1 {
	
	public void m1() {
		System.out.println("m1 method");
	}
	
	public void m2(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Demo1 p1=new Demo1();
		p1.m1();
		p1.m2(100, 200);

}
}
