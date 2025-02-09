package Userdefinedmethods;

public class Split {

public static void main(String[] args) {
		
		String a="Amit Patil";
		
		String [] abc=a.split(" ");
		
		String d=abc[0];
		
		for(int i=d.length()-1;i>=0;i--)
		{
			System.out.print(d.charAt(i));
		}
		
	}
}
