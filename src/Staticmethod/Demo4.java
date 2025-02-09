package Staticmethod;

public class Demo4 {
	
	public static int m1() {
		System.out.println("m1 static method with int return type");//1
		return 100;
	}
	

	public static void main(String[] args) {
			int a=m1();
			System.out.println(a);//2
	}


}
