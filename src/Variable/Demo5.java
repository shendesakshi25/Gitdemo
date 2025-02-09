package Variable;

public class Demo5 {
	static Demo5 obj;
	
	Demo5(){
		System.out.println(" 0 args cons");
	}
	
	Demo5(int a){
		System.out.println("1 args cons "+a);
	}
	
	Demo5(int a, int b){
		System.out.println("2 args cons "+(a+b));
	}
	
	public void m1() {
		System.out.println("M1 method ");
	}
	
	public static void main(String[] args) {
		obj=new Demo5();
		obj.m1();
		obj=new Demo5(100);
	}
	
}


