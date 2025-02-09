package Programs;

public class Maxvalue {

	public static void main(String[] args) {
		int arr[]= {1,4,6,2,3,9};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(temp<arr[i])
			{
				temp=arr[i];
			}
		}
        System.out.println(temp);
	}

}
