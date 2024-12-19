package oops.copy;

public class MethodOverriding {

	public static void main(String[] args) {
		Child child = new Child();
		child.printHouse();	

}
}

class parent{
	void printHouse() {
		System.out.println("1950s house");
	}
	
}

class Child extends parent{
	void printHouse() {
		System.out.println("2024s house");
		
	}
}
