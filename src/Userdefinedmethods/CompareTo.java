package Userdefinedmethods;

public class CompareTo {
	public static void main(String[] args) {
		
		String a="selenium";//
		String b="Selenium";
		String c="SELENIUM";
		String d="selenium";
					
		System.out.println(a.compareTo(b));
		
		System.out.println(b.compareTo(c));
		
		System.out.println(c.compareTo(a));//
		
		System.out.println(a.compareTo(d));
		

}
}