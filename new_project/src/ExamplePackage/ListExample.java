package ExamplePackage;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
	ArrayList<Student> list = new 	ArrayList<Student> ();
	Student stu1 = new Student("Fita",15);
	list.add(stu1);
	list.add(new Student("kavin",18));
	list.add(new Student("rajesh",18));
	System.out.println(list);
	
	
	}

}
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
		
	}
	
	

