package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo4 {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
		
		al.add("selenium");
		al.add("java");
		al.add("true");
		al.add("test Selenium");
		al.add("cucucumber");
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
	}

}

	


