package new_project;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);

		}

	}
}
