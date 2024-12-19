package new_project;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int input;
		System.out.println("check given number is even or odd");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		
		if(input%2==0) { 
		System.out.println("given number is even");
		
		}
		else {
			System.out.println("given number is odd");
			
		}	
	}
}
