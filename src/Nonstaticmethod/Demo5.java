package Nonstaticmethod;

public class Demo5 {

	
	//non static method with return and 2 int parameter
	
		public int m1(int a, int b)
		{
			int c=a+b;
			return c;
		}
		
		public static void main(String[] args) {
			Demo5 obj=new Demo5();
			int d=obj.m1(10, 200);
			System.out.println(d);
			
			int e=obj.m1(1000, 2000);
			System.out.println(e);
		}

}
