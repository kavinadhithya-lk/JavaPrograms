package new_project;

public class FibonacciExample {


	public static void main(String[] args) {
		int count ;
		int n0 = 0;
		System.out.println(n0);
		int n1 = 1;
		System.out.println(n1);
		int temp;
		for (int i = 0; i <=10 ; i++) {
			temp = n0+n1;
			n0 = n1;
			n1 = temp;
			System.out.println(n1);
		}
	}
}
