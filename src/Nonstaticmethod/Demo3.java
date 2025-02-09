package Nonstaticmethod;

public class Demo3 {
	
	//non static method with String return and 0 args
		public String m1() {
			String a="Selenium";
			String b="Java";
			String c=a.concat(b);
			return c;
		}
		
		
		public static void main(String[] args) {
			Demo3 p1=new Demo3();
			System.out.println(p1.m1());
		}


}
