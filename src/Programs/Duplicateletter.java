package Programs;

public class Duplicateletter {

	public static void main(String[] args) {
	   int arr[]= {45,67,58,23,90};
	   
	   for(int i=0;i<=arr.length;i++)
	   {
		   for(int j=i+1;j<=arr.length;j++)
		   {
			   if(arr[i]==arr[j]&&i!=j)
			   {
				  System.out.println(arr[j]);
			   }
		   }
	   }

	}

}
