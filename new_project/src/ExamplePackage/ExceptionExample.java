package ExamplePackage;

public class ExceptionExample {

	public static void main(String[] args) {
	System.out.println("program begins");
	//		int[] b = new int[1];
		//	System.out.println(b[5]);
			try {
			String c= null;
			c.charAt(4);
			}catch(Exception e) {
			System.out.println("error occurs");
		}
			System.out.println("program ends");
	}
	}


