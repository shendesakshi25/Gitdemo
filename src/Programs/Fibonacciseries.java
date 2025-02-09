package Programs;

public class Fibonacciseries {

	public static void main(String[] args) {
	    int t3;
	    int t1=0;
	    int t2=1;
	    System.out.println(t1+""+t2);
	    for(int i=0;i<=1;i++)
	    {
	    	t3=t1+t2;
	    	t1=t2;
	    	t2=t3;
	    	System.out.println(t3);
	    }

	}

}
