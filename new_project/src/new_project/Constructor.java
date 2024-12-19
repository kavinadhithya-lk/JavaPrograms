package new_project;

public class Constructor {

	public static void main(String[] args) {
		Rocket psi = new Rocket("O2");
		psi.printFuel();

	}

}

class Rocket {
	String fuel;
	Rocket(String input) {
		fuel = input;
		System.out.println("constructor called");

	}

	void printFuel() {
		System.out.println(fuel);
	}
}
