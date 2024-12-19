package new_project;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		int input;
		System.out.println("student grade");
    	Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		if(input>=90){
		System.out.println("Grade O");
		}
		else if(input>=80) {
		
			System.out.println("Grade A");
		}
		else{
		System.out.println("Grade B");
			
		}
		}

}
