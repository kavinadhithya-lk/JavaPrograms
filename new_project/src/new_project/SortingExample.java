package new_project;

public class SortingExample {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("sorted array:");
        for (int num : array) {
        	System.out.print(num + " ");
        }
    }
}	
