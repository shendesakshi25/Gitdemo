package Nonstaticmethod;

public class Demo6 {
	
	// 1.Non static method without return type and 0 args
		public void m1() {
			System.out.println("Non static method without return type and 0 args");
		}
		
		// 2. Non static method without return type and with multiple parameter
		public void m2(String a, int b) {
			System.out.println(a + b);
			System.out.println("Non static method without return type and with 1 int and 1 String parameter");
		}

		// 3.Non static method with int return type and 0 args
		public int m3() {
			System.out.println("Non static method with int return type and 0 args");
			return 10;
		}

		// 4. Non static method with String return type and with 2 string parameter
		public String m4(String a, String b) {
			System.out.println("Non static method with String return type and with 2 string parameter");
			return a;
		}

		public static void main(String[] args) {
			Demo6 obj=new Demo6();
			obj.m1();
			obj.m2("java", 100);
			obj.m3();
			obj.m4("selenium", "testing");
			
		}
	

}
