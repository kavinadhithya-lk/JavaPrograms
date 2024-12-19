package new_project;

public class ConstructorPractice {

	public static void main(String[] args) {
		Shape5 rectangle = new Shape5(10,20);

		rectangle.printArea();
	}

}

class Shape5 {
	int length;
	int breadth;

	Shape5(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;

		System.out.println("Constructor called");
	}

	void printArea() {
		System.out.println(this.length * this.breadth);
	}
}
