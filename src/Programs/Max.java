package Programs;


public class Max {

	public static void main(String[] args) {
		int arr[]= {1,9,7,2,3,8};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
          System.out.println(arr[2]);
          System.out.println(arr[3]);
	}

}
