package Programs;

public class Stringpalindrome {

	public static void main(String[] args) {
        String str="dabh";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
        	rev=rev+str.charAt(i);
        }
     
        System.out.println(rev);
        
        if(rev.equals(str))
        {
        	System.out.println("It is palindrome");
        }
        else
        {
        	System.out.println("It is not palindrome");
        }
	}
 
}
