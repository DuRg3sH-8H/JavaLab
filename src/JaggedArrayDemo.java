public class JaggedArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a jagged array
        int[][] jaggedArray = new int[3][];

        // Initialize each sub-array with different lengths
        jaggedArray[0] = new int[] { 1, 2, 3 };
        jaggedArray[1] = new int[] { 4, 5, 6, 7 };
        jaggedArray[2] = new int[] { 8, 9 };

        // Access and print elements of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
