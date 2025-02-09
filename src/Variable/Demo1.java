package Variable;

public class Demo1 {
	
	// Global Instance or non static variable
		String a="Global non static Variable";
		static String b="Global Static Variable";
		
		public void m1() {
			int c=1000;
			System.out.println("Inside the M1 method a Variable "+a);
			
			System.out.println(b);
			System.out.println(c);
		}
		
		public static void m2() {
			Demo1 obj1=new Demo1();
			System.out.println(b);
		
			System.out.println("Under static method "+obj1.a);
		}
		
		
		public static void main(String[] args) {
			Demo1 obj=new Demo1();
			obj.m1();
			m2();
			System.out.println(b);
			System.out.println("a variable inside the Main method "+obj.a);
		}

	}


