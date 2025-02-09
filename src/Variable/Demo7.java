package Variable;

public class Demo7 extends Demo6 {
	
int a=999;
	
	public void m1() {
		System.out.println("m1 method in demo7 class");//1
	}
	
	
	public void m3() {
		super.m1();
		this.m1();
		int a=88;
		System.out.println(a);//88
		System.out.println(this.a);//999
		System.out.println(super.a);//100
	}
	
	public static void main(String[] args) {
		Demo7 obj=new Demo7();
		obj.m3();

	}

}
