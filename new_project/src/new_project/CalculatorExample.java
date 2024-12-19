package new_project;

import java.util.Scanner;

public class CalculatorExample {

	private static boolean exit;
	private static int a;
	private static int b;
	private static boolean operator=true;
	private static String result;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = 0;
		 b = scanner.nextInt();
		
         System.out.println("Enter the value of b");
         int b = 0;
         b = scanner.nextInt();
         System.out.println("Enter the operation(+,-,*,/):");
         char operation = scanner.next().charAt(0);
         
         while(operator) {
        	 switch(operation) {
        	 case '+':
              System.out.println(a+b);
              break;
              
        	 case '-':
        		 System.out.println(a-b);
        		 break;
        		 
        	 case '*':
        		 System.out.println(a*b);
        		 break;
        		  
        	 case '/':
        		 System.out.println(a/b);
        		 break;
        		 
        	 default:
        		 System.out.println("invalid");
        		 break;
        		  
        		 
        	 }
			System.out.println("Result:"+result);
        	 System.out.println("do you want to continue?(y/n):");
        	 operator=scanner.nextBoolean();
/*        	 char Choice = scanner.nextBoolean();
        	 char choice = 0;
			if(choice!='y') {
        		 break;
        		 
			}*/
         }
	}
}   



