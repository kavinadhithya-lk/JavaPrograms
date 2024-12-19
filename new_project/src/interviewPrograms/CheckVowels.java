package interviewPrograms;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Take input from the user

        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        // Check if the string contains any vowel
        if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o") || input.contains("u")) {
            System.out.println("The string contains at least one vowel.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }

        scanner.close(); 
    }
}



