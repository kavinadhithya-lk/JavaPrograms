package new_project;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many numbers to print");
		count = scanner.nextInt();

		for (int i = 0; i <= count; i++) {
			System.out.println(i);
		}
		String[] students = new String[] { "fouzia", "kavin", "kalai", "dharshika" };
		for (int i = 0; i <= 3; i++) {
			System.out.println(students[i]);
		}
		
		}

	}


