package ExamplePackage;

public class ExampleBank {

	public static void main(String[] args) {
		BOI boi = new BOI();
		boi.startAccount();

	}

}
abstract class BANCS{
	void startAccount() {
		System.out.println("account started functionality");
	}
	abstract void checkKYC();
}
 class BOI extends BANCS{
	void checkKYC() {
		
	}
	
}
 
 
