import java.util.Scanner;

public class naturalnumberssum {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = reader.nextInt();

        int sum=0;

        for(int i =0;i<=number;i++){
            sum+=i;

        }
        System.out.println("The sum is : " + sum);
    }
}
