
package new_project;

public class ThreadExample {

	public static void main(String[] args) {
		Functionality1 functionality1 = new Functionality1();
		functionality1.start();

	    Functionality2 functionality2 = new Functionality2();
	    Thread thread = new Thread(functionality2);
	    thread.start();
	    System.out.println("program ends");




	}

}
class Functionality1 extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);	
			}catch(InterruptedException e) {e.printStackTrace();}
				System.out.println("Funtionality1 : "+i);
			}
		
		
	}
}

class Functionality2 implements Runnable{
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println("Funtionality2 : "+i);
			}	
	}
}


