package oops.copy;

public class PracticeAssesment {
    public static void main(String[] args) {
        String word = "malayalam";
        int count = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'm') {
                count++;
            }
        }
        
        System.out.println("Number of 'm' in malayalam: " + count);
    }
}
