package Polydemo;

public class Child extends Parent{

	public void m1() {
		System.out.println("m1 methods in child class ");
	}
	
	
	public static void main(String[] args) {
		Parent obj=new Parent();
		obj.m1();
	}
	
	
}
