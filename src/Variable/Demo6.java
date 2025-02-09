package Variable;

public class Demo6 {
	
	int a=100;
	int b=20;
	
	public void m1() {
		System.out.println("m1 method in demo6 class");//1
	}
	
	public void m2() {
		this.m1();
		System.out.println("m2 method in demo7 class");//2
	}

	public static void main(String[] args) {
		Demo6 obj=new Demo6();
		obj.m2();
		
	}

}
