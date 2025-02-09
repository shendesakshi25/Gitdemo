package Staticmethod;

public class Demo1 {
	
	//static method without return type and 0 args
		public static void m1() {
			System.out.println("m1 method");//2
		}

		public static void main(String[] args) {
			System.out.println("MMS");//1
			//m1();
			Demo1.m1();
			//Demo1 obj=new Demo1();
			//obj.m1();
			System.out.println("MME");//3
		}


}
