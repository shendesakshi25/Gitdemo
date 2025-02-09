package NonstaticANDstaticmethod;

public class Demo1 {
	
	// Declare non static method
			public void m1() {
				System.out.println("M1 method");
			}
			
		//declare static method
			public static int m2(int a, String b) {
				System.out.println(a+b);
				System.out.println("M2 method");
				return a;
			}
		
		//declare non static method
			public int m3(int a, int b) {
				int c=a*b;
				System.out.println(c);
				System.out.println("M3 method");
				return c;
			}
			
		
		public static void main(String[] args) {
			Demo1 obj=new Demo1();
			obj.m1();
			m2(20,"Selenium");
			obj.m3(10, 200);
		}



}
