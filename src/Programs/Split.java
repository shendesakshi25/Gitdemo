package Programs;

public class Split {

	public static void main(String[] args) {
		String str="Sakshi Shende";
		String arr[]=str.split("");
		String a=arr[1];
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
