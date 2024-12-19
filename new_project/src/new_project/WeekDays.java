package new_project;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		int input;
		System.out.println("weekdays");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
	     default:
	    	 System.out.println("not a valid week");
		}
		
		
	

	}

}
