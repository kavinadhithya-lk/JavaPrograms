package oops.copy;

public class StaticExample {

	public static void main(String[] args) {

	Counter.count++;
	Counter counter1=new Counter();
	counter1.printCount();
	
	
	Counter.count++;
	Counter counter2=new Counter();
	counter2.printCount();
	

	}

}
class Counter{
	static int count = 0;
	void printCount(){
		System.out.println(Counter.count);
		
	}
	
}
