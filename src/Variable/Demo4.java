package Variable;

public class Demo4 extends Demo3{

	
	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		String c=obj.getName();
		System.out.println(c);//Private
		
		obj.p1("Selenium testing");
		
		System.out.println(obj.getName());
	}
}
