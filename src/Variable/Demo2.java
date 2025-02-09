package Variable;

public class Demo2 {

	//Global Instance / Non Static variable
		int a=200;
		// Global Static Variable
		static int b=100;
		
		public void m1() {
			int c=1000;
			System.out.println(a);//200
			System.out.println(b);//100
			System.out.println(c);//1000
		}
		
		public static void m2() {
			Demo1 obj=new Demo1();
			System.out.println(obj.a);//200
			System.out.println(b);//100
		}
		
		public static void main(String[] args) {
			Demo1 o=new Demo1();
			System.out.println(o.a);//200
			System.out.println(b);//100
			o.m1();
			m2();
		}
		
	
}
