package Userdefinedmethods;

public class EqualIgnorecase {

	public static void main(String[] args) {
		String a="selenium";//
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
		
		System.out.println(a.equalsIgnoreCase(b));//t
		System.out.println(a.equalsIgnoreCase("testing"));//f
		
		System.out.println(a.equalsIgnoreCase(c));//t
		
	}

}
