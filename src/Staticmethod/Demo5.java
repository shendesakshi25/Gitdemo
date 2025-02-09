package Staticmethod;

public class Demo5 {

	public static String abc(String a, String b) {
		return a.concat(b);		
	}
	
	public static void main(String[] args) {
		String c=Demo5.abc("selenium", "testing");
		System.out.println(c);
	}

}
