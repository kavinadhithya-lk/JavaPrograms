package new_project;

public class MethodOverriding {

	public static void main(String[] args) {
		child Child = new child();
		Child.printHouse();	

}
}

class parent{
	void printHouse() {
		System.out.println("1950s house");
	}
	
}

class child extends parent{
	void printHouse() {
		System.out.println("2024s house");
		
	}
}
