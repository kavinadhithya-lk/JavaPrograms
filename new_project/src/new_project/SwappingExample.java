package new_project;

public class SwappingExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        b = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
