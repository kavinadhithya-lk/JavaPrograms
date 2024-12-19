package ExamplePackage;



public class InheritancePractice {

	public static void main(String[] args) {

		Output child = new Output();
	}

}

class Parent {
	Parent(String name) {
		System.out.println(name);
	}

}

class Output extends Parent {
	Output() {
		super("kavin");
		System.out.println("construtor called from parent ");
	}
	public void printHouse() {

	}
}