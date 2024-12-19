package new_project;

public class Multilevel	{

	public static void main(String[] args) {
		Nexon6V kavincar = new Nexon6V();
		kavincar.printBrand();
		kavincar.printModel();
		kavincar.printCapacity();

	}

}

class Nexon {
	void printBrand() {
		int cc;
		System.out.println("TATA");

	}
}

class NexonEv extends Nexon {
       void printModel() {
    	   System.out.println("GT 5");
    	   
       }

}

class Nexon6V extends NexonEv{
	void printCapacity() {
		System.out.println("1000 lbs");
		super.printBrand();
		System.out.println("cc");
	}
	
}
