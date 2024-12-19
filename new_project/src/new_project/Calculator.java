package new_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		char operator;
		char execute = 'y';
		while (execute == 'y') {
			System.out.println("Enter value a");
			a = scanner.nextInt();
			System.out.println("Enter value b");
			b = scanner.nextInt();
			System.out.println("Enter operator +,-,*,/");
			operator = scanner.next().charAt(0);
			switch (operator) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			default:
				System.out.println("operation is invalid");
				break;
		

		}
		System.out.println("Do you want to execute again y/n?");
		execute = scanner.next().charAt(0);
	}
 }
}     

