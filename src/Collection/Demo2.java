package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo2 {

	public static void main(String[] args) {
LinkedList ls=new LinkedList();
		
		ls.add(1221);
		ls.add('A');
		ls.add(true);
		ls.add("java");
		ls.add(24.325);
		ls.add(null);
		ls.add(1221);
		
		System.out.println(ls);
		ls.set(3, "Cucumber");
		//System.out.println(ls.get(3));
		System.out.println(ls);
		ls.removeFirst();
		System.out.println(ls);
		ls.removeLast();
		System.out.println(ls);
		
		for(Object xyz:ls)
		{
			System.out.println(xyz);
		}
		
	}
	}




