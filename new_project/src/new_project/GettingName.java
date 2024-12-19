package new_project;

import java.util.Scanner;

public class GettingName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//default line for getting variable
		
		System.out.println("Enter student Name");
		String name;//declaration
	    name = scanner.nextLine();//definition

	   System.out.println("Enter maths mark:");
	   byte mathsMark;
	   mathsMark = scanner.nextByte();
	   
	   System.out.println("enter phone number");
	   long phoneNumber;
	   phoneNumber = scanner.nextLong();
	   
	   System.out.println("enter your grade");
	   char grade;
	   grade = scanner.next().charAt(0);
	   
	   System.out.println("enter your average");
	   float average;
	  average = scanner.nextFloat();
	   
	   System.out.println("enter hostler or not");
	   boolean hostler;
	   hostler = scanner.nextBoolean();
	   
	   
	   
	   
	   
	   
	   
	    //printing the variables
	    System.out.println("Your name is :"+name);
	    System.out.println("Your marks is:"+mathsMark);
	    System.out.println("Your phone number is:"+phoneNumber);
	    System.out.println("Your grade is:"+grade);
	    System.out.println("Your average is:"+average);
	    System.out.println("hostler or not:"+hostler);
	    
	    
		

	}

}
