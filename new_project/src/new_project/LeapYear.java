package new_project;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		for (int i = 2000; i <= 2050; i++) {
			if (i % 4 != 0) {
				continue;
			}
			System.out.println(i);

	}

}
}
 