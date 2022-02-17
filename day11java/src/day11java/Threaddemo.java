package day11java;

class A extends Thread {
	  public void run() {
		  System.out.println("current id of A :" + Thread.currentThread().getId());
	  }
}
class B extends Thread {
	  public void run() {
		  System.out.println("current id of B :" + Thread.currentThread().getId());
	  }
}	  
	  class C extends Thread {
		  public void run() {
			  System.out.println("current id of C :" + Thread.currentThread().getId());
		  }
	  }		  
	  class D implements Runnable {
		  public void run() {
			  System.out.println("Current id of D :" + Thread.currentThread().getId());
		  }
	  }
public class Threaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            A a = new A();
            a.start();
            B b = new B();
            b.start();
            C c = new C();
            c.start();
            D d = new D();
            Thread th = new Thread(d);
            th.start();
            //d.start();
            System.out.println("current id of main :" + Thread.currentThread().getId());
	}

}
