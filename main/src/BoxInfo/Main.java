package BoxInfo;

public class Main {
    public static void main(String[] args) {
        // Create two Box objects with different dimensions
        Box box1 = new Box(2.0, 3.0, 4.0);
        Box box2 = new Box(5.0, 6.0, 7.0);

        double ans1 = box1.getVolume();
        double ans2 = box2.getVolume();

        // Calculate and print the volume of the boxes
        System.out.println("Volume of box1: " + ans1);
        System.out.println("Volume of box2: " + ans2);


    }
}
