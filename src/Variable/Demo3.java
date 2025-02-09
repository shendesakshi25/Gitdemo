package Variable;

public class Demo3 {

	
private String a="private";//selenium testing
	
	// Non static method with String return and 0 args
	
	public String getName() {
		return a;
	}
		
	// non static method with 1 String args and without return type
	
	public void p1(String newName)
	{
		a=newName;
	}
	

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		System.out.println(obj.a);

	}

}
