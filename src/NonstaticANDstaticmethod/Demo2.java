package NonstaticANDstaticmethod;

public class Demo2 {
	
	public static void m1() {
		System.out.println("M1 method ::: 2");//2
		m2();
		System.out.println("M1 method Ended :: 4");//4
	}
	
	public static void m2() {
		System.out.println("M2 method :: 3");//3
	}
	
	
	public static void main(String[] args) {
		System.out.println("MMS :: 1");//1
		m1();
		System.out.println("MME :: 5");//5
		
	}


}
