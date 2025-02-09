package Polydemo;

public class Demo2 {

	public void add(int a,int b)
	{
		System.out.println("2 int args"+(a+b));
	}
	
	public void add(int a,String b)
	{
		System.out.println("1 int and 1 String");
	}
	
	public void add(int a, float b)
	{
		System.out.println("1 int and 1 float ");
	}
	
	public void add(float a, int b)
	{
		System.out.println("1 float nad 1 int ");
	}
	
	public void add(String b, int a)
	{
		System.out.println("1 String and 1 int");
	}
	
	public void add(String a, String b)
	{
		System.out.println("2 String args");
	}
	
	public void add(float a, float b)
	{
		System.out.println("2 float ");
	}
	
	
	
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.add(12.34f, 23.434f);
		obj.add(24.23f, 235);
		obj.add(245, 35.36f);
		obj.add(10, 20);
		obj.add(120, "java");
		obj.add("java", "selenium");
		obj.add("selenium", 21942);
		
		
	}

}
