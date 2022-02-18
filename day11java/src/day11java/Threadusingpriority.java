package day11java;

class A1 extends Thread {
	  public void run() {
		  System.out.println("current id of A :" + Thread.currentThread().getId());
	  }
}
class B1 extends Thread {
	  public void run() {
		  System.out.println("current id of B :" + Thread.currentThread().getId());
	  }
}	  
	  class C1 extends Thread {
		  public void run() {
			  System.out.println("current id of C :" + Thread.currentThread().getId());
		  }
	  }		  
	  class D1 implements Runnable {
		  public void run() {
			  System.out.println("Current id of D :" + Thread.currentThread().getId());
		  }
	  }
	  public class Threadusingpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A1 a = new A1();
          a.setPriority(Thread.MIN_PRIORITY);
          a.start();
          B1 b = new B1();
          b.setPriority(Thread.NORM_PRIORITY);
          b.start();
          C1 c = new C1();
          c.setPriority(Thread.MIN_PRIORITY);
          c.start();
          D1 d = new D1();
          Thread th = new Thread(d);
          th.start();
          //d.start();
          System.out.println("current id of main :" + Thread.currentThread().getId());
          System.out.println("done");
	}

}