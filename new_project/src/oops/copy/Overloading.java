package oops.copy;

public class Overloading {

	public static void main(String[] args) {
		B b = new B();
		b.multply(10,20);
		b.multply(12.5,2.3);
	}

}
class A{
	void multply(int a,int b) {
		System.out.println("From A");
		System.out.println(a*b);
	}
}
class B extends A{
	void multply(double a,double b) {
		System.out.println("From B");
		System.out.println(a*b);
	}
}
