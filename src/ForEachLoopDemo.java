public class ForEachLoopDemo {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Use a for-each loop to iterate through the elements
        System.out.println("Using a for-each loop to iterate through the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Create a list of strings
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve" };

        // Use a for-each loop to iterate through the elements
        System.out.println("\nUsing a for-each loop to iterate through the array:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
