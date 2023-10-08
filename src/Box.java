import java.util.Scanner;

public class Box {
    int length;
    int breadth;

    public Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length * breadth;
    }

    public void display() {
        int area = calculateArea();
        System.out.println("Area of the box: " + area);
    }

    public static void main(String[] args) {

        int length, breadth;

        Scanner reader = new Scanner(System.in);

            System.out.print("Name : Durga Shankar Bhandari \n");
            System.out.print("Roll no. : 191818 \n");
            System.out.print("----------------------------------------\n");
        System.out.print("Enter the length : ");
        length = reader.nextInt();

        System.out.print("Enter the breadth : ");
        breadth = reader.nextInt();

        Box box = new Box(length, breadth);
        box.display();
    }
}
