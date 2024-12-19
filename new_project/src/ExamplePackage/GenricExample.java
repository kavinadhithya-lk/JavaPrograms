package ExamplePackage;

public class GenricExample {

	public static void main(String[] args) {
		AddUtil<Integer> addutil = new 	AddUtil<Integer>();
		addutil.add(1,5);
		
		AddUtil<Double> addutildouble = new 	AddUtil<Double>();
		addutildouble.add(1.0,5.0);
		
		AddUtil<String> addutilstring = new 	AddUtil<String>();
		addutilstring.add("a","b");
		
		

	}

}
class AddUtil<T>{
	public void add(T a, T b) {
		System.out.println(a);
		
	}
}
