package Programs;

public class Primenumber {

	public static void main(String[] args) {
		int n=7;
		int flag=0;
				{
		for(int i=3;i<n;i++)
		{
			if(n%i<=0)	
			{
				flag=1;
						break;
			}
		}
	     if(flag==0)
	     {
	    	 System.out.println("It is prime number");
	     }
	     else
	     {
	    	 System.out.println("not prime number");
	     }

	}

}
}