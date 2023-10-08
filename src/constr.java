import java.util.Scanner;

public class constr {
    private int num1;
    private int num2;

    public constr(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void swap() {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public void display() {
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();

        constr swapInstance = new constr(num1, num2);

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        swapInstance.swap();
        swapInstance.display();

        scanner.close();
    }
}
