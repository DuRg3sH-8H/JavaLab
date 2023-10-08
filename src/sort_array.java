import java.util.Scanner;

public class sort_array {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] array1 =new int [10];

        System.out.println("Enter number of items: ");
        int number = reader.nextInt();

        for(int i =0;i<number;i++){
            System.out.println("Enter number  " + i +":");
            array1[i] = reader.nextInt();
        }
        System.out.println("ARRAY:");
        for(int i =0;i<=number;i++){
            System.out.println(array1[i]);
        }
    }

}

