package new_project;

public class ClassPractice {

	public static void main(String[] args) {
		Car suzuki = new Car();
		suzuki.color = "green";
		System.out.println(suzuki.color);
		
		Car nissan = new Car();
		nissan.color = "yellow";
		System.out.println(nissan.color);

	}

}
  class Car{
	String color;
}
