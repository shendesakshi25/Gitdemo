package Programs;

public class Tutorial {

	public static void main(String[] args) {
		String n="Suraj salve";
		String [] arr=n.split(" ");
		for(int i=0; i<arr.length; i++){
		  for(int j=arr[i].length()-1; j>=0; j--){
		    System.out.println(arr[i].charAt(j));
		}

	}

	}
}
