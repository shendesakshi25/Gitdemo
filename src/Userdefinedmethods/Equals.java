package Userdefinedmethods;

public class Equals {
	
	public static void main(String[] args) {
		String a="selenium";//
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a.equals(b));//f
		System.out.println(a.equals(c));//f
		System.out.println(b.equals(c));//f
		System.out.println(a.equals(d));//t
		

}
}
