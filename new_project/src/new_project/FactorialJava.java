package new_project;

import java.util.Scanner;

public class FactorialJava {

	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		input = scanner.nextInt();
		
		int output = 1;
		for(int i=1;i<=input;i++) {
			output = output*i;
			
		}
		System.out.println(output);

	}

}
