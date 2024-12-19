package oops.copy;

public class SortwithoutTemp {
	public static void main(String[] args) {
		int[] array = { 44, 22, 66, 55 };
		for (int i = 0; i < array.length-1; i++) {
	
				if(array[i]>array[i+1]) {
					array[i] = array[i] + array[i + 1];
					array[i + 1] = array[i] - array[i + 1];
					array[i] = array[i] - array[i + 1];
					
					
				}
			
		}
		for(int a:array) {
			System.out.println(a);
		}

}
}
