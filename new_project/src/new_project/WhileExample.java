package new_project;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=1;
		while(count<7) {
			System.out.println("kavin");
			count++;
		}
		String password;
		do {
			System.out.println("Enter valid password");
			password = scanner.nextLine();
		}while(!password.equals("kavin123"));
		System.out.println("WELCOME");

	}

}
