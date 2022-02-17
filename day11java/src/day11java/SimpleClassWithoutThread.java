package day11java;

class Simple1 {
	   void m1() {
		  System.out.println("simple class 1");
	  }
}		  
class Simple2  {
	   void m2() {
		  System.out.println("simple class 2");
	  }
}		  
	  class Simple3  {
		   void m3() {
			  System.out.println("simple class 3");
		  }
	  }		  
	  class Simple4  {
		   void m4() {
			  System.out.println("simple class 4");
		  }
	  }		  
	  class Simple5 {
		   void m5() {
			  System.out.println("simple class 5");
		  }
	  }		  
	  class Simple6  {
		   void m6() {
			  System.out.println("simple class 6");
		  }
	  }		  

public class SimpleClassWithoutThread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" I AM THE FIRST!");
		Simple1 s1 = new Simple1();
		s1.m1();
		Simple3 s3 = new Simple3();
		s3.m3();
		Simple2 s2 = new Simple2();
		s2.m2();
		Simple4 s4 = new Simple4();
		s4.m4();
		Simple5 s5 = new Simple5();
		s5.m5();
		Simple6 s6 = new Simple6();
		s6.m6();
		System.out.println(" I AM THE LAST!");

	}
}
