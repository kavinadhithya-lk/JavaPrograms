package new_project;

public class ReverseExample {
    public static void main(String[] args) {
        int number = 251;
        int reversedNumber = 0;
        
        while (number != 0){
        	int output = number % 10;
            reversedNumber = reversedNumber * 10 + output;
            number /= 10;
        }
        
        System.out.println(reversedNumber);
    }	
} 	
