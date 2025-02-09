package Abstract;

public  class Demo1 implements Sample1{

		
		@Override
		public void m1() {
				System.out.println("M1 method");
		}

		@Override
		public void m2() {
			System.out.println("M2 method");		
		}

		@Override
		public void m3() {
			System.out.println("M3 method");		
		}
		
		public static void main(String[] args) {
			Demo1 obj=new Demo1();
			obj.m1();
			obj.m2();
			obj.m3();
		}

	
	         

	}


