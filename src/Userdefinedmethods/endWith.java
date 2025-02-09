package Userdefinedmethods;

public class endWith {

public static void main(String[] args) {
		
		String a="Selenium with the help of java";
		
		System.out.println(a.endsWith("help"));
		
		System.out.println(a.endsWith("JAVA"));//f
		
		System.out.println(a.endsWith("java"));//true
		
		System.out.println(a.endsWith("help of java"));//true
		
	}
}
