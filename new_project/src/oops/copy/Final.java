package oops.copy;

public class Final {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.printArea();
		
	}

}

class Circle{
	final double pi = 3.14;
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void printArea() {
		System.out.println(pi*radius);
	}	           
}
                        