package ExamplePackage;

public class Javatest {

	public static void main(String[] args) {
		 Box box = new Box();
         box.height = 1;
         box.length = 5;
         box.width = 5;
         box.volume(3,2,1);
         System.out.println(box.volume); 
		

	}

}
class Box {
    int width;
    int height;
    int length;
    int volume;
    void volume(int height, int length, int width) {
         volume = width*height*length;
    }
}    