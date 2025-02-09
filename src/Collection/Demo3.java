package Collection;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1234);
		al.add("Selenium");
		al.add(244.435f);
		al.add(true);
		al.add("Selenium");
		al.add(null);
		
		System.out.println(al);
		al.set(2, "Cucumber");
		al.remove(3);
		System.out.println(al);
	}

	}


