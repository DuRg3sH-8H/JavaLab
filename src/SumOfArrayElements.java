public class SumOfArrayElements {
    public static void main(String[] args) {
        // Create an array to store the first 15 natural numbers
        int[] naturalNumbers = new int[15];

        // Populate the array with the first 15 natural numbers
        for (int i = 0; i < 15; i++) {
            naturalNumbers[i] = i + 1;
        }

        // Calculate the sum of the 3rd and last element
        int thirdElement = naturalNumbers[2]; // Index 2 corresponds to the 3rd element
        int lastElement = naturalNumbers[14]; // Index 14 corresponds to the last element
        int sum = thirdElement + lastElement;

        // Display the result
        System.out.println("The sum of the 3rd and last element of the array is: " + sum);
    }
}
