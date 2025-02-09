package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Demo7 {

	public static void main(String[] args) {
HashMap<String, Integer>  h1=new HashMap<String, Integer>();
		
		h1.put("java",100);
		h1.put("selenium", 200);
		h1.put("cucumber", 300);
		h1.put("testng", 400);
		h1.put("POM", 500);
		h1.put("Hybrid Framewor", 600);
		
		
		//System.out.println(h1);
		
		Set<String> abc=h1.keySet();
		System.out.println(abc);
		
		Collection<Integer> b=h1.values();
		
		System.out.println(b);
		
	}

	}


