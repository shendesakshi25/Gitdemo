package Nonstaticmethod;

public class Demo4 {

	
public boolean abc() {
		
		String a="Selenium";
		String b="selenium";
		boolean c=a.equals(b);
		return c;
	}
	
	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		boolean d=obj.abc();
		System.out.println(d);
	}

}
