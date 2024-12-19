package new_project;

public class MethodPractice {

	public static void main(String[] args) {
		System.out.println(add(4,5));
		printMyName();
		System.out.println(checkEven(30));
		

	}
	static int add(int a,int b) {
	return a+b;
	}
	static void  printMyName() {
		System.out.println("kavin");

}
	static boolean checkEven(int a) {
		return a%2==0;
	}
}

