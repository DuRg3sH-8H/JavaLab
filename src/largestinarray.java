import java.util.Scanner;
public class largestinarray {
    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);
        int[] array2 =new int [10];

        System.out.println("Enter number of items: ");
        int number = reader.nextInt();

        for(int i =0;i<number;i++){
            System.out.println("Enter number  " + i +":");
            array2[i] = reader.nextInt();
        }
        double smallest = array2[0];
        for (int i =0;i<number;i++) {
            if (smallest < number) {
                smallest = number;
            }
        }
       /* double[] array1 = {12,13,14};
        double largest = array1[0];
        for (double number:array1) {
            if (largest < number) {
                largest = number;
            }
        }*/
        System.out.println("smallest number : " + smallest);
    }
}

